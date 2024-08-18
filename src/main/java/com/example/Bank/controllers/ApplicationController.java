package com.example.Bank.controllers;

import com.example.Bank.model.Branch;
import com.example.Bank.model.Services;
import com.example.Bank.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ApplicationController {

    @Autowired
    ApplicationService service;

    @RequestMapping("/{bankName}")
    String getPageWithBranchList(@PathVariable String bankName,Model model){
        List<Branch> list=service.getBranchListByBankName(bankName);
        model.addAttribute("bankName", bankName);
        model.addAttribute("branches", list);
        return "branches";

    }

    @RequestMapping("/service/{bankName}")
    public String showServices(@PathVariable String bankName,@RequestParam String branchName, Model model) {
        List<Services> services = service.findServicesByBranch(branchName);
        model.addAttribute("bankName", bankName+" - "+branchName);
        model.addAttribute("services", services);
        return "services";
    }
}
