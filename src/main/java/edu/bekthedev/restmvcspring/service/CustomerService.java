package edu.bekthedev.restmvcspring.service;

import edu.bekthedev.restmvcspring.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

        Customer getCustomerById(UUID id);

        List<Customer> getAllCustomers();
    }