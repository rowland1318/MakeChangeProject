package com.skilldistillery.homework;

import java.util.Scanner;

public class MakeChange {
	
	static double price;
	static double money;

public static void main(String[] args) {
		
		welcomeQuestions();
		amountCalculations(price, money);
		
	}

	public static void welcomeQuestions() {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the price of the item: ");
		price = keyboard.nextDouble();

		System.out.print("How much money was tendered: ");
		money = keyboard.nextDouble();
		keyboard.close();
	}
	
	public static void amountCalculations(double price2, double money2) {
		int oneCent = 1;
		int fiveCents = 5;
		int tenCents = 10;
		int twentyFiveCents = 25;
		int oneDollar = 100;
		int fiveDollars = 500;
		int tenDollars = 1000;
		int twentyDollars = 2000;
		
		double change = money2 - price2;

		if (money2 == price2) {
			System.out.println("You have provided the exact amount");
		}

		else if (money2 < price2) {
			System.out.println("You have provided too little money");
		}

		else if (money2 > price2) {
			System.out.printf("Change provided %.2f %n", change);

			int changeMultiplied = (int) (change * 100);

			if (changeMultiplied >= twentyDollars) {
				int twentyAmount = changeMultiplied / twentyDollars;
				if (twentyAmount == 1) {
					System.out.println(twentyAmount + " twenty dollar bill");
				} else if (twentyAmount > 1) {
					System.out.println(twentyAmount + " twenty dollar bills");
				}
			}

			changeMultiplied = changeMultiplied % twentyDollars;

			if (changeMultiplied >= tenDollars) {
				int tenAmount = changeMultiplied / tenDollars;
				if (tenAmount == 1) {
					System.out.println(tenAmount + " ten dollar bill");
				} else if (tenAmount > 1) {
					System.out.println(tenAmount + " ten dollar bills");
				}
			}

			changeMultiplied = changeMultiplied % tenDollars;

			if (changeMultiplied >= fiveDollars) {
				int fiveAmount = changeMultiplied / fiveDollars;
				if (fiveAmount == 1) {
					System.out.println(fiveAmount + " five dollar bill");
				} else if (fiveAmount > 1) {
					System.out.println(fiveAmount + " five dollar bills");
				}
			}

			changeMultiplied = changeMultiplied % fiveDollars;

			if (changeMultiplied >= oneDollar) {
				int oneAmount = changeMultiplied / oneDollar;
				if (oneAmount == 1) {
					System.out.println(oneAmount + " one dollar bill");
				} else if (oneAmount > 1) {
					System.out.println(oneAmount + " one dollar bills");
				}
			}
			changeMultiplied = changeMultiplied % oneDollar;

			if (changeMultiplied >= twentyFiveCents) {
				int quarterAmount = changeMultiplied / twentyFiveCents;
				if (quarterAmount == 1) {
					System.out.println(quarterAmount + " quarter");
				} else if (quarterAmount > 1) {
					System.out.println(quarterAmount + " quarters");
				}
			}
			changeMultiplied = changeMultiplied % twentyFiveCents;

			if (changeMultiplied >= tenCents) {
				int dimeAmount = changeMultiplied / tenCents;
				if (dimeAmount == 1) {
					System.out.println(dimeAmount + " dime");
				} else if (dimeAmount > 1) {
					System.out.println(dimeAmount + " dimes");
				}
			}
			changeMultiplied = changeMultiplied % tenCents;

			if (changeMultiplied >= fiveCents) {
				int nickelAmount = changeMultiplied / fiveCents;
				if (nickelAmount == 1) {
					System.out.println(nickelAmount + " nickel");
				} else if (nickelAmount > 1) {
					System.out.println(nickelAmount + " nickels");
				}
			}
			changeMultiplied = changeMultiplied % fiveCents;

			if (changeMultiplied >= oneCent) {
				int pennyAmount = changeMultiplied / oneCent;
				if (pennyAmount == 1) {
					System.out.println(pennyAmount + " penny");
				} else if (pennyAmount > 1) {
					System.out.println(pennyAmount + " pennies");
				}
			}
		}
	}
}
