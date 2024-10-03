package com.example.springwork1.service;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import com.example.springwork1.entity.Customer;

@Service
public interface CustomerService {

    List<Customer> getCustomerList();

    Customer createCustomer(Customer customer);

    Customer getCustomerById(String id);

    Customer updateCustomer(String id, Customer customer);

    void deleteCustomer(String id);

}
