package com.atm.atm_case_study;

public class Account {
	private int accountNumber;
	private int pin;
	private double availableBalance;
	private double totalBalance;

	public Account(int theAccountNumber, int thePin, double theAvailableBalance, double theTotalBalance) {
		accountNumber = theAccountNumber;
		pin = thePin;
		availableBalance = theAvailableBalance;
		totalBalance = theTotalBalance;
	}
	public boolean validatePIN (int userPIN) {
		if (pin == userPIN)
			return true;
		else
			return false;
	}
	public double getAvailableBalance(){
		return availableBalance;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void credit(double amount) {
		totalBalance += amount;
	}
	public void depit(double amount) {
		availableBalance -= amount;
		totalBalance -= amount;
	}
}
