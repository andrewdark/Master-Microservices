package ua.pp.darknsoft.accounts.service;

import ua.pp.darknsoft.accounts.dto.CustomerDto;

public interface IAccountsService {
    /**
     * Creates a new account for the given customer.
     *
     * @param customerDto the customer details
     * @throws IllegalArgumentException if the given customer is null
     */
    void createAccount(CustomerDto customerDto) throws IllegalArgumentException;

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);
}
