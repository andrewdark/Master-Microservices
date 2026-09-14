package ua.pp.darknsoft.accounts.service.impl;

import org.springframework.stereotype.Service;
import ua.pp.darknsoft.accounts.dto.CustomerDetailsDto;
import ua.pp.darknsoft.accounts.service.ICustomersService;

@Service
public class CustomersServiceImpl implements ICustomersService {
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        CustomerDetailsDto customerDetailsDto = new CustomerDetailsDto();
        customerDetailsDto.setMobileNumber(mobileNumber);
        return customerDetailsDto;
    }
}
