package ua.pp.darknsoft.accounts.service;

import ua.pp.darknsoft.accounts.dto.CustomerDto;
import ua.pp.darknsoft.accounts.exception.ResourceNotFoundException;

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

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto) throws ResourceNotFoundException;

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber) throws ResourceNotFoundException;
}
