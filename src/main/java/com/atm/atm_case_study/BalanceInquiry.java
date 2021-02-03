package com.atm.atm_case_study;
public class BalanceInquiry extends Transaction {

	public BalanceInquiry (int userAccountNumber, Screen atmScreen, BankDatabase atmBankDatabase) {
		super(userAccountNumber, atmScreen, atmBankDatabase);
	}
	public void execute() {
		BankDatabase bankDatabase = getBankDatabase();
		Screen screen = getScreen();
		double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());
		double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());
		screen.displayMessageLine("\nBalance Information:");
		screen.displayMessage(" - Available balance: ");
		screen.dispalyDollarAmount(availableBalance);
		screen.displayMessage("\n - Total balance:");
		screen.dispalyDollarAmount(totalBalance);
		screen.displayMessageLine("");
	}
}
