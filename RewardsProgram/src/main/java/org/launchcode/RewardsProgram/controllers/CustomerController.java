package org.launchcode.RewardsProgram.controllers;

import org.launchcode.RewardsProgram.data.CustomerRepository;
import org.launchcode.RewardsProgram.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("index")
    public String homePage(Model model) {
        model.addAttribute("title", "home page");
        model.addAttribute(new Customer());
        return "index";
    }
    @PostMapping("index")
    public String homeyPage(@PathVariable Customer newCustomer, Model model) {
        customerRepository.save(newCustomer);
        model.addAttribute("customer", customerRepository.findAll());
        return "index";
    }


}
