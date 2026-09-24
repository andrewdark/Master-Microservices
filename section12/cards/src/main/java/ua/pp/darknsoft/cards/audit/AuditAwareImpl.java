package ua.pp.darknsoft.cards.audit;

import org.jspecify.annotations.NonNull;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;


/**
 * Class to get user name for audit.
 *
 * @author Andrew Dark
 * @since 0.1
 */
@Component(value = "auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    @NonNull
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CARDS_MS");
    }
}
