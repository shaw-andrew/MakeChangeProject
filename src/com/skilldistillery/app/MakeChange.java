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
					"Please instruct the customer to either put something back or submit more currency and try again.");
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
				System.out.print(num20 + " x $20 bill");

			}
			
			if ((change) >= 10) {
					change -= 10;
					num10++;
				}
				System.out.print(num10 + " x $10 bill");
				
			}

		}

	}


