package com.example.Bank.repository;

import com.example.Bank.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  ServiceRepository extends JpaRepository<Services,Long> {
    List<Services> findByBranch_BranchName(String BranchName);
}
