package com.atm.atm_case_study;

public class BankDatabase {
	private Account[] accounts;
	public BankDatabase() {
		accounts = new Account[5];
		accounts[0] = new Account(11111, 11111, 1000.0, 1500.0);
		accounts[1] = new Account(22222, 22222, 2000.0, 2500.0);
		accounts[2] = new Account(33333, 33333, 3000.0, 3500.0);
		accounts[3] = new Account(44444, 44444, 4000.0, 4500.0);
		accounts[4] = new Account(55555, 55555, 5000.0, 5500.0);
	}
	private Account getAccount(int accountNumber) {
		for (Account currentAccount : accounts) {
				if (currentAccount.getAccountNumber() == accountNumber)
					return currentAccount;
				}
			return null;
		}
	public boolean authenticateUser(int userAccountNumber, int userPin) {
		Account userAccount = getAccount(userAccountNumber);
		if (userAccount != null) {
			return userAccount.validatePIN(userPin);
		} else {
			return false;
		}
	}
	public double getAvailableBalance (int userAccountNumber) {
		return getAccount(userAccountNumber).getAvailableBalance();
	}
	public double getTotalBalance(int userAccountNumber) {
		return getAccount(userAccountNumber).getAvailableBalance();
	}
	public void credit(int userAccountNumber, double amount) {
		getAccount(userAccountNumber).credit(amount);
	}
	public void debit(int userAccountNumber, double amount) {
		getAccount(userAccountNumber).depit(amount);
	}
}
