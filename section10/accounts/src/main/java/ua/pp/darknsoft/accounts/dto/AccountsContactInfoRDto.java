package ua.pp.darknsoft.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;


/**
 * This class is used for storing configuration properties related to accounts.
 * In order to use this class, you need to enable the @EnableConfigurationProperties annotation
 * in your spring boot main class with the value of AccountsContactInfoRDto.class.
 * For example:
 * {@code @EnableConfigurationProperties(value = {AccountsContactInfoRDto.class})}
 * The properties will be loaded from the application.yaml file.
 */
@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoRDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
