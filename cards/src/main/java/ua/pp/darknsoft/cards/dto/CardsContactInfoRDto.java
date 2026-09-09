package ua.pp.darknsoft.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "cards")
public record CardsContactInfoRDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
