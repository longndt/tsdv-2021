package com.example.crud.controller;

import com.example.crud.model.Customer;
import com.example.crud.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(value = "/customers")
    public String getAllCustomer(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers",customers);
        return "customerList";
    }

    @RequestMapping(value = "/customer/{id}")
    public String getCustomerById(
            @PathVariable(value = "id") Long id, Model model) {
        Customer customer = customerRepository.getById(id);
        model.addAttribute("customer", customer);
        return "customerDetail";
    }

    @GetMapping(value = "/customer/add")
    public String showAddForm (Customer customer) {
        return "customerAdd";
    }

    @PostMapping(value = "/customer/add")
    public String addCustomer (Model model, @Valid Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            return "customerAdd";
        }
        customerRepository.save(customer);
        model.addAttribute("customer", customer);
        return "redirect:/customers";
    }

    @GetMapping(value = "/customer/update/{id}")
    public String showUpdateForm(
            @PathVariable (value = "id") Long id,
            Customer customer, Model model)  {
        customer = customerRepository.getById(id);
        model.addAttribute(customer);
        return "customerUpdate";
    }

    @RequestMapping(value = "/customer/update")
    public String updateCustomer(
            @RequestParam(value = "id", required = false) Long id,
            @Valid Customer customer, BindingResult result)
    {
        if (result.hasErrors()) {
            return "customerUpdate";
        }
        customer.setId(id);
        customerRepository.save(customer);
        return "redirect:/customers";
    }

    @RequestMapping(value = "/customer/delete/{id}")
    public String deleteCustomer(
            @PathVariable(value = "id") Long id) {
        Customer customer = customerRepository.getById(id);
        customerRepository.delete(customer);
        return "redirect:/customers";
    }
}
