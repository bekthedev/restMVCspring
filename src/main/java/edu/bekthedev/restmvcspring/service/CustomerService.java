package edu.bekthedev.restmvcspring.service;

import edu.bekthedev.restmvcspring.model.Beer;
import edu.bekthedev.restmvcspring.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

        Customer getCustomerById(UUID id);

        List<Customer> getAllCustomers();

        Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);

    void patchCustomerById(UUID customerId, Customer customer);
}