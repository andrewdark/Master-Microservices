package ua.pp.darknsoft.accounts.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.pp.darknsoft.accounts.dto.CustomerDto;
import ua.pp.darknsoft.accounts.service.IAccountsService;

@Service
@Transactional(readOnly = true)
public class AccountsServiceImpl implements IAccountsService {

    @Override
    @Transactional
    public void createAccount(CustomerDto customerDto) throws IllegalArgumentException {

    }

    @Override
    public CustomerDto fetchAccount(String mobileNumber) {
        return null;
    }
}
