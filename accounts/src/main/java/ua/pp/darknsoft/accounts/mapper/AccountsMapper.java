package ua.pp.darknsoft.accounts.mapper;

import ua.pp.darknsoft.accounts.dto.AccountsDto;
import ua.pp.darknsoft.accounts.entity.Accounts;


/**
 * @author AndrewDark
 * @since 1.0
 */
public final class AccountsMapper {

    private AccountsMapper() {
        // this class is not instantiable
        throw new AssertionError("Utility class");
    }

    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
