package ua.pp.darknsoft.accounts.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.pp.darknsoft.accounts.constants.AccountsConstants;
import ua.pp.darknsoft.accounts.dto.AccountsDto;
import ua.pp.darknsoft.accounts.dto.CustomerDto;
import ua.pp.darknsoft.accounts.dto.ResponseDto;
import ua.pp.darknsoft.accounts.service.IAccountsService;

import java.util.List;


/**
 * @author AndrewDark
 * @since 1.0
 */
@RestController
@RequestMapping(path="/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {
    private IAccountsService iAccountsService;

    @GetMapping("/accounts")
    public List<AccountsDto> getAccounts() {
        AccountsDto accountsDto = new AccountsDto();
        accountsDto.setAccountNumber(1234567890L);
        accountsDto.setAccountType("Savings");
        accountsDto.setBranchAddress("123 New York");
        return List.of(accountsDto);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@Valid @RequestBody CustomerDto customerDto) {
        iAccountsService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }

}
