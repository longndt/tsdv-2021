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

    @RequestMapping(value = "/")
    public String getAllCustomer(Model model) {
        List<Customer> customers = customerRepository.findAll();
        model.addAttribute("customers",customers);
        return "customerList";
    }

    @RequestMapping(value = "/{id}")
    public String getCustomerById(
            @PathVariable(value = "id") Long id, Model model) {
        Customer customer = customerRepository.getById(id);
        model.addAttribute("customer", customer);
        return "customerDetail";
    }

    @RequestMapping (value = "/add")
    public String addCustomer (Model model) {
        Customer  customer = new Customer();
        model.addAttribute("customer", customer);
        return "customerAdd";
    }

    @RequestMapping(value = "/update/{id}")
    public String showUpdateForm(
            @PathVariable (value = "id") Long id, Model model)  {
        Customer customer = customerRepository.getById(id);
        model.addAttribute(customer);
        return "customerUpdate";
    }

    @RequestMapping(value = "/save")
    public String saveUpdate(
            Customer customer,
            @RequestParam(value = "id", required = false) Long id)
    {
        customer.setId(id);
        customerRepository.save(customer);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteCustomer(
            @PathVariable(value = "id") Long id) {
        Customer customer = customerRepository.getById(id);
        customerRepository.delete(customer);
        return "redirect:/";
    }
}
