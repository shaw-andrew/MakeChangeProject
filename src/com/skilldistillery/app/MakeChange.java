package com.skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double cost = 0.0;
		double cash = 0.0;

		cost = costOfItems();

		cash = cashSubmitted();

		if (cash > cost) {
			printChange(cost, cash);
		}

		else if (cash < cost) {
			System.out.println(
					"Please instruct the customer to either put something back or submit more currency then try again.");
		}

		else if (cash == cost) {
			System.out.println("Thank the customer for providing exact change.");
		}

		kb.close();
	}

	public static double costOfItems() {
		Scanner kb = new Scanner(System.in);
		System.out.println("How much money do the customer's items cost?");
		double cost = kb.nextDouble();
		return cost;
	}

	public static double cashSubmitted() {
		Scanner kb = new Scanner(System.in);
		System.out.println("How much money did the customer submit for payment?");
		double cash = kb.nextDouble();
		return cash;

	}

	public static void printChange(double cost, double cash) {
		int change = 0;
		int numBills = 0;

		// multiply by 100 to remove rounding errors.
		cash = Math.round(cash * 100);
		cost = Math.round(cost * 100);
		change = (int) ((cash - cost));
		System.out.print("Change: ");

		numBills = numBillsPrint(change, 2000, "$20 bill", "$20 bills");
		change = updateChange(change, 2000);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 1000, "$10 bill", "$10 bills");
		change = updateChange(change, 1000);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 500, "$5 bill", "$5 bills");
		change = updateChange(change, 500);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 100, "$1 bill", "$1 bills");
		change = updateChange(change, 100);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 25, "quarter", "quarters");
		change = updateChange(change, 25);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 10, "dime", "dimes");
		change = updateChange(change, 10);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 5, "nickel", "nickels");
		change = updateChange(change, 5);
		addComma(change, numBills);

		numBills = numBillsPrint(change, 1, "penny", "pennies");
		change = updateChange(change, 1);
		addComma(change, numBills);

	}

	public static int numBillsPrint(int change, int value, String singular, String plural) {
		int numBills = 0;
		numBills = change / value;
		if (numBills >= 2) {
			System.out.print(numBills + " x " + plural);
		}
		if (numBills == 1) {
			System.out.print(numBills + " x " + singular);
		}
		return numBills;
	}

	public static int updateChange(int change, int value) {
		change = change % value;
		return change;
	}

	public static void addComma(int change, int numbills) {
		if ((change > 0) && (numbills != 0))
			System.out.print(", ");
	}
}
