package org.launchcode.RewardsProgram.controllers;

import org.launchcode.RewardsProgram.data.CustomerRepository;
import org.launchcode.RewardsProgram.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("index")
    public String homePage() {
        return "index";
    }
    @PostMapping("index")
    public String homeyPage(@PathVariable Customer firstName) {
        return "index";
    }


}
