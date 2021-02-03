package com.atm.atm_case_study;

public class Screen {
	public void displayMessage(String message) {
		System.out.print(message);
	}
	public void displayMessageLine(String message) {
		System.out.println(message);
	}
	public void dispalyDollarAmount(double amount) {
		System.out.printf("$%,.2f", amount);
	}
}