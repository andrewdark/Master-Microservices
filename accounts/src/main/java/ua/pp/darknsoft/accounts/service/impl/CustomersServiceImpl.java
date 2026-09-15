package ua.pp.darknsoft.accounts.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.pp.darknsoft.accounts.dto.AccountsDto;
import ua.pp.darknsoft.accounts.dto.CardsDto;
import ua.pp.darknsoft.accounts.dto.CustomerDetailsDto;
import ua.pp.darknsoft.accounts.dto.LoansDto;
import ua.pp.darknsoft.accounts.entity.Accounts;
import ua.pp.darknsoft.accounts.entity.Customer;
import ua.pp.darknsoft.accounts.exception.ResourceNotFoundException;
import ua.pp.darknsoft.accounts.mapper.AccountMapper;
import ua.pp.darknsoft.accounts.mapper.CustomerMapper;
import ua.pp.darknsoft.accounts.repository.AccountRepository;
import ua.pp.darknsoft.accounts.repository.CustomerRepository;
import ua.pp.darknsoft.accounts.service.ICustomersService;
import ua.pp.darknsoft.accounts.service.client.CardsFeignClient;
import ua.pp.darknsoft.accounts.service.client.LoansFeignClient;

@Service
@RequiredArgsConstructor
public class CustomersServiceImpl implements ICustomersService {

    private final AccountRepository accountsRepository;
    private final CustomerRepository customerRepository;
    private final CardsFeignClient cardsFeignClient;
    private final LoansFeignClient loansFeignClient;

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {

        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(mobileNumber);
        customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());
        return customerDetailsDto;
    }
}
