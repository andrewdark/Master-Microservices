package ua.pp.darknsoft.message.dto;

/**
 * @param accountNumber
 * @param name
 * @param email
 * @param mobileNumber
 * @author Andrew Dark
 */
public record AccountsMsgRDto(Long accountNumber, String name, String email, String mobileNumber) {
}
