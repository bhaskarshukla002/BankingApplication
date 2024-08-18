package com.example.Bank.service;

import com.example.Bank.model.Branch;
import com.example.Bank.model.Services;
import com.example.Bank.repository.BranchRepository;
import com.example.Bank.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private ServiceRepository serviceRepository;


    public List<Branch> getBranchListByBankName(String bankName) {
        return branchRepository.findByBranchBankName(bankName);

    }

    public List<Services> findServicesByBranch(String branchName) {
        return serviceRepository.findByBranch_BranchName(branchName);
    }
}
