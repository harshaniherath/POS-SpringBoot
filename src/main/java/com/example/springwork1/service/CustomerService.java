package com.example.springwork1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springwork1.dto.CustomerDto;
import com.example.springwork1.entity.Customer;

@Service
public interface CustomerService {

    Customer saveCustomer(CustomerDto dto);

    Customer updateCustomer(CustomerDto dto);

    void deleteCustomer(String custId);

    List<CustomerDto> loadAllCustomer();

    Customer getCustomerById(String custId);
}
