package com.example.Bank.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "service")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long serviceId;

    private String serviceName;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;
}
