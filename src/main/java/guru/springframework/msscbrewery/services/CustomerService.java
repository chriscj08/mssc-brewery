package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);

    Customer saveNewCustomer(Customer customer);

    void updateCustomer(UUID customerId, Customer customer);

    void deleteCustomer(UUID customerId);
}
