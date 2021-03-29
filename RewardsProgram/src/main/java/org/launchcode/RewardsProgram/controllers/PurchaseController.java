package org.launchcode.RewardsProgram.controllers;

import java.util.Optional;
import org.launchcode.RewardsProgram.data.PurchaseRepository;
import org.launchcode.RewardsProgram.data.RewardsPointsRepository;
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
    @Autowired
    private RewardsPointsRepository rewardsPointsRepository;

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
        model.addAttribute("purchases", purchaseRepository.findAll());
        model.addAttribute("amount", newPurchase.getAmount());
        return "points";
    }

    @GetMapping("points")
    public String displayRewardsPoints(@RequestParam(required = false) Integer purchaseId, Model model) {
        if (purchaseId == null) {
            model.addAttribute("title", "Points");
            model.addAttribute("points", rewardsPointsRepository.findAll());
        } else {
            Optional<Purchase> result = purchaseRepository.findById(purchaseId);
            if (result.isEmpty()) {
                model.addAttribute("title", "Invalid" + purchaseId);
            } else {
                Purchase purchase = result.get();
                model.addAttribute("title", "Purchases" + purchase.getAmount());
            }
        }
        return "purchase";
    }
}
