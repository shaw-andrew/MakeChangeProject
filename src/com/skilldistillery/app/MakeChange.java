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
		double change = 0.0;
		int num20 = 0;
		int num10 = 0;
		int num5 = 0;
		int numDoll = 0;
		int numQuar = 0;
		int numDime = 0;
		int numNick = 0;
		int numPenn = 0;

		change = cash - cost;

		System.out.print("Change: ");

		while (change > 0.01) {
			if ((change) >= 20) {
				while (change >= 20) {
					change -= 20;
					num20++;
				}
				if (num20 >= 1) {
					System.out.print(num20 + " x $20 bill ");
				}

			}

			if ((change) >= 10) {
				change -= 10;
				num10++;
			}
			if (num10 > 0)
				System.out.print(num10 + " x $10 bill ");

			if ((change) >= 5) {
				change -= 5;
				num5++;
			}
			if (num5 > 0)
				System.out.print(num5 + " x $5 bill ");

			if ((change) >= 1) {
				while (change >= 1) {
					change -= 1;
					numDoll++;
				}
			}
			if (numDoll > 0)
				System.out.print(numDoll + " x $1 bill ");

			if ((change) >= .25) {
				while (change >= .25) {
					change -= .25;
					numQuar++;
				}
			}
			if (numQuar > 0)
				System.out.print(numQuar + " x quarter ");

			if ((change) >= .10) {
				change -= .10;
				numDime++;
			}
			if (numDime > 0)
				System.out.print(numDime + " x dime ");

			if ((change) >= .05) {
				change -= .05;
				numNick++;
			}
			if (numNick > 0)
				System.out.print(numNick + " x nickel ");

			if ((change) >= .01) {
				while (change >= .01) {
					change -= .01;
					numPenn++;
				}
			}
			if (numPenn > 0)
				System.out.print(numPenn + " x penny");

		}

	}

}
