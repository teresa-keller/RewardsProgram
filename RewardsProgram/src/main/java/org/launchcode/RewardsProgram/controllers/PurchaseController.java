package org.launchcode.RewardsProgram.controllers;

import java.util.Optional;
import org.launchcode.RewardsProgram.data.PurchaseRepository;
import org.launchcode.RewardsProgram.models.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("purchase")

public class PurchaseController {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @GetMapping
    public String recordPurchase(Model model) {
        model.addAttribute("title", "Purchase");
        model.addAttribute(new Purchase());
        return "purchase";
    }

    @PostMapping
    public String pointsEarned(@ModelAttribute Purchase newPurchase, Model model) {
//        model.addAttribute("title", "Rewards Points");
        purchaseRepository.save(newPurchase);
        model.addAttribute("purchase", purchaseRepository.findAll());
        model.addAttribute("amount", newPurchase.getAmount());
        return "points";
    }
}
