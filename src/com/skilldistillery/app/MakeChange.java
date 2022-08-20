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
			calculateChange(cost, cash);
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

	public static void calculateChange(double cost, double cash) {
		int change = 0;
//		int num20 = 0;
//		int num10 = 0;
//		int num5 = 0;
//		int numDoll = 0;
//		int numQuar = 0;
//		int numDime = 0;
//		int numNick = 0;
//		int numPenn = 0;

		// multiply by 100 to remove rounding errors.
		System.out.println(Math.round(cash * 100));
		cash = Math.round(cash * 100);
		cost = Math.round(cost * 100);
		// System.out.println(cost*100);
		change = (int) ((cash - cost));
		// System.out.println(change);
		System.out.print("Change: ");

		// if ((change) >= 2000) {

//			num20 = change / 2000;
//			change = change % 2000;
//
//			if (num20 == 1) {
//				System.out.print(num20 + " x $20 bill ");
//			} else if (num20 >= 2) {
//				System.out.print(num20 + " x $20 bills ");
//			}
		math(change, 2000, "$20 bill", "$20 bills");
		change = updateChange(change, 2000);
		addComma(change);

		math(change, 1000, "$10 bill", "$10 bills");
		change = updateChange(change, 1000);
		addComma(change);

		math(change, 500, "$5 bill", "$5 bills");
		change = updateChange(change, 500);
		addComma(change);

		math(change, 100, "$1 bill", "$1 bills");
		change = updateChange(change, 100);
		addComma(change);

		math(change, 25, "quarter", "quarters");
		change = updateChange(change, 25);
		addComma(change);

		math(change, 10, "dime", "dimes");
		change = updateChange(change, 10);
		addComma(change);

		math(change, 5, "nickel", "nickels");
		change = updateChange(change, 5);
		addComma(change);

		math(change, 1, "penny", "pennies");
		change = updateChange(change, 1);
		addComma(change);

	}
	// }

//		if ((change) >= 1000) {
//			
//			num10 = change/1000;
//			change = change % 1000;
//			
//			//change -= 1000;
//			//num10++;
//		}
//		if (num10 > 0) {
//			System.out.print(num10 + " x $10 bill ");
//		}
//
//		if ((change) >= 500) {
//			change -= 500;
//			num5++;
//		}
//		if (num5 > 0) {
//			System.out.print(num5 + " x $5 bill ");
//		}
//
//		if ((change) >= 100) {
//			while (change >= 100) {
//				numDoll = change / 100;
//				change = change % 100;
//				
//			//	change -= 100;
//			//	numDoll++;
//			}
//		}
//		if (numDoll == 1) {
//			System.out.print(num20 + " x $1 bill ");
//		} else if (numDoll >= 2) {
//			System.out.print(num20 + " x $1 bills ");
//		}
//
//		if ((change) >= 25) {
//			while (change >= 25) {
//				change -= 25;
//				numQuar++;
//			}
//		}
//		if (numQuar > 0) {
//			System.out.print(numQuar + " x quarter ");
//		}
//
//		if ((change) >= 10) {
//			numDime = change / 10;
//			change = change % 10;
//			// change -= .10; should I use a while loop here to keep it an int?
//			// numDime++;
//		}
//		if (numDime == 1) {
//			System.out.print(numDime + " x dime ");
//		} else if (numDime >= 2) {
//			System.out.print(numDime + " x dimes ");
//		}
//		
//
//		if ((change) >= 05) {
//			change -= 05;
//			numNick++;
//		}
//		if (numNick > 0) {
//			System.out.print(numNick + " x nickel ");
//		}
//		System.out.println(change);
//		if ((change) >= 1) {
//			while (change >= 1) {
//				++numPenn;
//				change -= 1;
//			}
//		}
//		if (numPenn >= 2) {
//			System.out.print(numPenn + " x pennies");
//		} if (numPenn == 1) {
//			System.out.print(numPenn + " x penny");
//		}
//		}

	public static int math(int change, int value, String singular, String plural) {
		int numbills = 0;
		numbills = (int) change / value;
		if (numbills >= 2) {
			System.out.print(numbills + " x " + plural);
		}
		if (numbills == 1) {
			System.out.print(numbills + " x " + singular);
		}
		return numbills;
	}

	public static int updateChange(int change, int value) {
		change = change % value;
		// System.out.println(change);
		return change;
	}

	public static void addComma(int change, int numbills) {
		if ((change > 0) && (numbills != 0)) { /////////////Find a way to determine the num bills so i don't have unnecessary commas
			System.out.print(", ");
		}
	}
}
