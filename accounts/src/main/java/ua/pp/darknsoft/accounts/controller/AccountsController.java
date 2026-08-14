package ua.pp.darknsoft.accounts.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pp.darknsoft.accounts.dto.AccountsDto;

import java.util.List;

@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    @GetMapping("/accounts")
    public List<AccountsDto> getAccounts() {
        AccountsDto accountsDto = new AccountsDto();
        accountsDto.setAccountNumber(1234567890L);
        accountsDto.setAccountType("Savings");
        accountsDto.setBranchAddress("123 New York");
        return List.of(accountsDto);
    }
}
