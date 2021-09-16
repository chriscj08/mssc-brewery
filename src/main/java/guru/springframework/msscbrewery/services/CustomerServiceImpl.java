package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder().id(UUID.randomUUID()).name("Chris Jurrens").build();
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        return Customer.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {
        //Add implementation to update customer
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //Add implementation to delete customer
        log.debug("Deleting a customer...");
    }
}
