package ua.pp.darknsoft.gatewayserver.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.*;
import java.util.stream.Collectors;

public class KeycloakRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {
    @Override
    public Collection<GrantedAuthority> convert(Jwt source) {
        Object realmAccessObj = source.getClaims().get("realm_access");
        Map<String, Object> realmAccess = Collections.emptyMap();

        if (realmAccessObj instanceof Map<?, ?> rawMap) {
            // Безпечне приведення через перевірку, що ключі та значення відповідають типам
            realmAccess = rawMap.entrySet().stream()
                    .filter(e -> e.getKey() instanceof String)
                    .collect(Collectors.toMap(
                            e -> (String) e.getKey(),
                            Map.Entry::getValue
                    ));
        }
        if (realmAccess.isEmpty()) {
            return new ArrayList<>();
        }

        Object rolesObj = realmAccess.get("roles");
        Collection<GrantedAuthority> returnValue = Collections.emptyList();
        if (rolesObj instanceof List<?>) {
            returnValue = ((List<?>) rolesObj)
                    .stream().filter(String.class::isInstance)
                    .map(String.class::cast)
                    .map(roleName -> "ROLE_" + roleName)
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
        }
        return returnValue;
    }
}
