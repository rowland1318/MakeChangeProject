package com.skilldistillery.homework;


import java.util.Scanner;

public class MakeChange {

	static Scanner kb = new Scanner(System.in);
	static double price;
	static double money;
	static double change;
	
	

	public static void main(String[] args) {

		welcomeQuestions();
		amountCalculations(price, money);

	}

	public static void welcomeQuestions() {
		System.out.println("What is the price of the item: ");
		price = kb.nextDouble();

		System.out.println("How much money was tendered: ");
		money = kb.nextDouble();
		
		kb.close();
	}

	public static void amountCalculations(double price2, double money2) {
		change = money2 - price2;
		if (money2 < price2) {
			System.out.println("You provided too little money");
		} else if (money2 == price2) {
			System.out.println("You have provided the exact amount recieved");
		} else if (money2 > price2) {
			System.out.printf("Change provided %.2f %n", change);
			if (change >= 20) {
				int twentyAmount = (int)(change / 20);
				change = (change % 20);
				if (twentyAmount == 1) {
					System.out.println(twentyAmount + " twenty dollar bill");
				} else if (twentyAmount > 1) {
					System.out.println(twentyAmount + " twenty dollar bills");
				}
			}
			if (change >= 10) {
				int tenAmount = (int)(change / 10);
				change = (change % 10);
				if (tenAmount == 1) {
					System.out.println(tenAmount + " ten dollar bill");
				} else if (tenAmount > 1) {
					System.out.println(tenAmount + " ten dollar bills");
				}
			}
			if (change >= 5) {
				int fiveAmount = (int)(change / 5);
				change = (int) (change % 5);
				if (fiveAmount == 1) {
					System.out.println(fiveAmount + " five dollar bill");
				} else if (fiveAmount > 1) {
					System.out.println(fiveAmount + " five dollar bills");
				}
				
			}
			if (change >= 1) {
				int oneAmount = (int)(change / 1);
				change = (change % 1);
				if (oneAmount == 1) {
					System.out.println(oneAmount + " one dollar bill");
				} else if (oneAmount > 1) {
					System.out.println(oneAmount + " one dollar bills");
				}
			}
			if (change >= .25) {
				int quarterAmount = (int)(change / .25);
				change = (change % .25);
				if (quarterAmount == 1) {
					System.out.println(quarterAmount + " quarter");
				} else if (quarterAmount > 1) {
					System.out.println(quarterAmount + " quarters");
				}
			}
			if (change >= .10) {
				int dimeAmount = (int)(change / .10);
				change = (change % .10);
				if (dimeAmount == 1) {
					System.out.println(dimeAmount + " dime");
				} else if (dimeAmount > 1) {
					System.out.println(dimeAmount + " dimes");
				}
			}
			if (change >= .05) {
				int nickelAmount = (int)(change / .05);
				change = (change % .05);
				if (nickelAmount == 1) {
					System.out.println(nickelAmount + " nickel");
				} else if (nickelAmount > 1) {
					System.out.println(nickelAmount + " nickels");
				}
			}
			if (change >= .001) {
				int pennyAmount = (int)(change / .009);
				if (pennyAmount == 1) {
					System.out.println(pennyAmount + " penny");
				} else if (pennyAmount > 1) {
					System.out.println(pennyAmount + " pennies");
				}
			}
		}

		
		
	}

}
