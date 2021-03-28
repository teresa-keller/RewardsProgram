package org.launchcode.RewardsProgram.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("purchase")

public class PurchaseController {

    @GetMapping
    public String recordPurchase() {
        return "purchase";
    }

    @PostMapping
    public String pointsEarned() {
        return "points";
    }
}
