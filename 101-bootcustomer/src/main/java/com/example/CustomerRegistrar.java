package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by hatoriz on 1/27/17.
 */
@Component
public class CustomerRegistrar {

    CustomerRepository customerRepository;

    @Autowired
    CustomerRegistrar(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    Customer register(Customer customer){
        Optional<Customer> existingCustomer = customerRepository.findByName(customer.getName());
        if (existingCustomer.isPresent()){
            throw new RuntimeException("is already exists");
        } else {
            customerRepository.save(customer);
        }
        return customer;
    }
}
