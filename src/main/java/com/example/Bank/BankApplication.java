package com.example.Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

//	@Bean
//	CommandLineRunner initDatabase(BankRepository  bankRepository, ServiceRepository serviceRepository, BranchRepository branchRepository) {
//		return args -> {
//			// Creating Banks using Builder Pattern
//			Bank bankOfIndia = Bank.builder().name("Bank of India").build();
//			Bank hdfcBank = Bank.builder().name("HDFC Bank").build();
//			Bank iciciBank = Bank.builder().name("ICICI Bank").build();
//			Bank sbiBank = Bank.builder().name("State Bank of India").build();
//
//			// Saving Banks
//			bankRepository.save(bankOfIndia);
//			bankRepository.save(hdfcBank);
//			bankRepository.save(iciciBank);
//			bankRepository.save(sbiBank);
//
//			// Creating Branches for Bank of India (Bangalore)
//			Branch koramangalaBranch = Branch.builder()
//					.branchName("Koramangala Branch")
//					.branchBankName("Bank of India")
//					.address("Koramangala, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch mgRoadBranch = Branch.builder()
//					.branchName("MG Road Branch")
//					.branchBankName("Bank of India")
//					.address("MG Road, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch whitefieldBranch = Branch.builder()
//					.branchName("Whitefield Branch")
//					.branchBankName("Bank of India")
//					.address("Whitefield, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch indiranagarBranch = Branch.builder()
//					.branchName("Indiranagar Branch")
//					.branchBankName("Bank of India")
//					.address("Indiranagar, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch jayanagarBranch = Branch.builder()
//					.branchName("Jayanagar Branch")
//					.branchBankName("Bank of India")
//					.address("Jayanagar, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch hebbalBranch = Branch.builder()
//					.branchName("Hebbal Branch")
//					.branchBankName("Bank of India")
//					.address("Hebbal, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch jpNagarBranch = Branch.builder()
//					.branchName("JP Nagar Branch")
//					.branchBankName("Bank of India")
//					.address("JP Nagar, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch electronicCityBranch = Branch.builder()
//					.branchName("Electronic City Branch")
//					.branchBankName("Bank of India")
//					.address("Electronic City, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch banashankariBranch = Branch.builder()
//					.branchName("Banashankari Branch")
//					.branchBankName("Bank of India")
//					.address("Banashankari, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			Branch yelahankaBranch = Branch.builder()
//					.branchName("Yelahanka Branch")
//					.branchBankName("Bank of India")
//					.address("Yelahanka, Bangalore")
//					.bank(bankOfIndia)
//					.build();
//
//			// Saving Branches for Bank of India
//			branchRepository.save(koramangalaBranch);
//			branchRepository.save(mgRoadBranch);
//			branchRepository.save(whitefieldBranch);
//			branchRepository.save(indiranagarBranch);
//			branchRepository.save(jayanagarBranch);
//			branchRepository.save(hebbalBranch);
//			branchRepository.save(jpNagarBranch);
//			branchRepository.save(electronicCityBranch);
//			branchRepository.save(banashankariBranch);
//			branchRepository.save(yelahankaBranch);
//
//			// Creating and Saving Services for Bank of India Branches (Bangalore)
//			serviceRepository.save(Service.builder().serviceName("Savings Account").branch(koramangalaBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Fixed Deposit").branch(koramangalaBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Home Loan").branch(koramangalaBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Car Loan").branch(koramangalaBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Savings Account").branch(mgRoadBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Personal Loan").branch(mgRoadBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Mutual Funds").branch(mgRoadBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Current Account").branch(whitefieldBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Credit Card").branch(whitefieldBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Insurance").branch(whitefieldBranch).build());
//
//			// Add more services for other branches similarly...
//
//			// Creating Branches and Services for HDFC Bank
//			Branch connaughtPlaceBranch = Branch.builder()
//					.branchName("Connaught Place Branch")
//					.branchBankName("HDFC Bank")
//					.address("Connaught Place, New Delhi")
//					.bank(hdfcBank)
//					.build();
//			Branch noidaSector18Branch = Branch.builder()
//					.branchName("Sector 18 Branch")
//					.branchBankName("HDFC Bank")
//					.address("Sector 18, Noida")
//					.bank(hdfcBank)
//					.build();
//			Branch juhuBranch = Branch.builder()
//					.branchName("Juhu Branch")
//					.branchBankName("HDFC Bank")
//					.address("Juhu, Mumbai")
//					.bank(hdfcBank)
//					.build();
//
//			branchRepository.save(connaughtPlaceBranch);
//			branchRepository.save(noidaSector18Branch);
//			branchRepository.save(juhuBranch);
//
//			serviceRepository.save(Service.builder().serviceName("Savings Account").branch(connaughtPlaceBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Home Loan").branch(connaughtPlaceBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Credit Card").branch(connaughtPlaceBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Personal Loan").branch(noidaSector18Branch).build());
//			serviceRepository.save(Service.builder().serviceName("Fixed Deposit").branch(noidaSector18Branch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Mutual Funds").branch(juhuBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Insurance").branch(juhuBranch).build());
//
//			// Creating Branches and Services for ICICI Bank
//			Branch chandniChowkBranch = Branch.builder()
//					.branchName("Chandni Chowk Branch")
//					.branchBankName("ICICI Bank")
//					.address("Chandni Chowk, New Delhi")
//					.bank(iciciBank)
//					.build();
//			Branch marineDriveBranch = Branch.builder()
//					.branchName("Marine Drive Branch")
//					.branchBankName("ICICI Bank")
//					.address("Marine Drive, Mumbai")
//					.bank(iciciBank)
//					.build();
//			Branch annaNagarBranch = Branch.builder()
//					.branchName("Anna Nagar Branch")
//					.branchBankName("ICICI Bank")
//					.address("Anna Nagar, Chennai")
//					.bank(iciciBank)
//					.build();
//
//			branchRepository.save(chandniChowkBranch);
//			branchRepository.save(marineDriveBranch);
//			branchRepository.save(annaNagarBranch);
//
//			serviceRepository.save(Service.builder().serviceName("Savings Account").branch(chandniChowkBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Home Loan").branch(chandniChowkBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Personal Loan").branch(marineDriveBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Credit Card").branch(marineDriveBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Mutual Funds").branch(annaNagarBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Insurance").branch(annaNagarBranch).build());
//
//			// Creating Branches and Services for State Bank of India (SBI)
//			Branch nehruPlaceBranch = Branch.builder()
//					.branchName("Nehru Place Branch")
//					.branchBankName("State Bank of India")
//					.address("Nehru Place, New Delhi")
//					.bank(sbiBank)
//					.build();
//			Branch btmLayoutBranch = Branch.builder()
//					.branchName("BTM Layout Branch")
//					.branchBankName("State Bank of India")
//					.address("BTM Layout, Bangalore")
//					.bank(sbiBank)
//					.build();
//			Branch maladWestBranch = Branch.builder()
//					.branchName("Malad West Branch")
//					.branchBankName("State Bank of India")
//					.address("Malad West, Mumbai")
//					.bank(sbiBank)
//					.build();
//
//			branchRepository.save(nehruPlaceBranch);
//			branchRepository.save(btmLayoutBranch);
//			branchRepository.save(maladWestBranch);
//
//			serviceRepository.save(Service.builder().serviceName("Savings Account").branch(nehruPlaceBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Fixed Deposit").branch(nehruPlaceBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Personal Loan").branch(btmLayoutBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Home Loan").branch(btmLayoutBranch).build());
//
//			serviceRepository.save(Service.builder().serviceName("Credit Card").branch(maladWestBranch).build());
//			serviceRepository.save(Service.builder().serviceName("Insurance").branch(maladWestBranch).build());
//		};
//	}

}
