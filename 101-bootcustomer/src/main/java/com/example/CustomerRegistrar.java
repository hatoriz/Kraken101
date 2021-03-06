package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by hatoriz on 1/27/17.
 */
@Lazy
@Component
public class CustomerRegistrar {

    CustomerRepository customerRepository;
    Sender sender;

    @Autowired
    CustomerRegistrar(CustomerRepository customerRepository, Sender sender){
        this.customerRepository = customerRepository;
        this.sender = sender;
    }

    Customer register(Customer customer){
        Optional<Customer> existingCustomer = customerRepository.findByName(customer.getName());
        if (existingCustomer.isPresent()){
            throw new RuntimeException("is already exists");
        } else {
            customerRepository.save(customer);
            sender.send(customer.getEmail());
        }
        return customer;
    }
}
