package com.example.crud.controller;

import com.example.crud.model.Customer;
import com.example.crud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerAPIController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("")
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(
            @PathVariable(value = "id") Long id) {
        Customer customer = customerRepository.findById(id).get();
        return customer;
    }

    @PostMapping("/add")
    public Customer addCustomer(
            @Valid @RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @PutMapping("/update/{id}")
    public void updateCustomer(
            @PathVariable(value = "id") Long id,
            @Valid @RequestBody Customer customer) {
        if (customerRepository.existsById(id)) {
            customer.setId(id);
            customerRepository.save(customer);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(
            @PathVariable(value = "id") Long id) {
        Customer customer = customerRepository.findById(id).get();
        customerRepository.delete(customer);
    }
}

