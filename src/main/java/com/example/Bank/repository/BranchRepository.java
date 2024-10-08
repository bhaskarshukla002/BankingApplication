package com.example.Bank.repository;

import com.example.Bank.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch,Long> {
    List<Branch> findByBranchBankName(String bankName);
}
