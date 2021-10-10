package MakeChangeProject;

import java.util.Scanner;

//In the cash register we will calculate the amount of change returned to a customer based on the 
//purchase price and the amount tendered. We will also notify the attendant how many of each piece of
//currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. 
//Change should be provided using the largest bill and coin denominations as possible. Denominations 
//that are not used should not be displayed.
//
//Hint: Mod operator
//User Story #1
//
//The user is prompted asking for the price of the item.
//User Story #2
//
//The user is then prompted asking how much money was tendered by the customer.
//User Story #3
//
//Display an appropriate message if the customer provided too little money or the exact amount.
//User Story #4
//
//If the amount tendered is more than the cost of the item, display the number of bills and coins that
//should be given to the customer.

public class MakeChangeProject {
	public static void main(String[] args) {
		double quartersDue;
		double dimesDue;
		double nicklesDue;
		double penniesDue;
		int twentyDollarBills;
		int tenDollarBills;
		int fiveDollarBills;
		int singleDollarBills;
		int dollarsOnly = 0;
		double itemCost;
		double moneyTendered;
		double changeDue= 0.0;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("How much is the item?: ");
		itemCost = scanner.nextDouble();
		
		System.out.print("How much money was tendered?: ");
		moneyTendered = scanner.nextDouble();
		
		if (moneyTendered < itemCost) {
			System.out.println("Not enough money");
		}
		else if (moneyTendered > itemCost) {
			changeDue = (moneyTendered - itemCost) + 0.001;
			System.out.println("Your change is: " + changeDue);
				while (changeDue > 0) {
					if (changeDue >= 20.0) {
						dollarsOnly = (int)(changeDue);
						twentyDollarBills = twentiesDue(dollarsOnly); 
						System.out.println(twentyDollarBills + " Twenty dollarbill(s)");
						changeDue -= (twentyDollarBills * 20);
						dollarsOnly -= (twentyDollarBills * 20);
//						
					}
					else if (changeDue < 20 && changeDue >=10) {
						dollarsOnly = (int)(changeDue);
						tenDollarBills = tensDue(dollarsOnly); 
						System.out.println(tenDollarBills + " Ten dollarbill(s)");
						changeDue -= (tenDollarBills * 10);
						dollarsOnly -= (tenDollarBills * 10);
						
						
					}
					else if (changeDue < 10 && changeDue >=5) {
						dollarsOnly = (int)(changeDue);
						fiveDollarBills = fivesDue(dollarsOnly); 
						System.out.println(fiveDollarBills + " Five dollarbill(s)");
						changeDue -= (fiveDollarBills * 5);
						dollarsOnly -= (fiveDollarBills * 5);
						
					}
					else if (changeDue < 5 && changeDue > 1.0) {
						dollarsOnly = (int)(changeDue);
						singleDollarBills = singlesDue(dollarsOnly); 
						System.out.println(singleDollarBills + " Single dollarbill(s)");
						changeDue -= (singleDollarBills * 1);
						dollarsOnly -= (singleDollarBills * 1);
					}
					else if (changeDue < 1.0 && changeDue >=0.25) {
						quartersDue = quartersDue(changeDue);
						int intQuartersDue = (int)(quartersDue);
						System.out.println(intQuartersDue + " Quarter(s)");
						changeDue -= (intQuartersDue * 0.25);
						dollarsOnly -= (intQuartersDue * 0.25);
						
					}
					else if (changeDue < 0.25 && changeDue >=0.10) {
						dimesDue = dimesDue(changeDue);
						int intDimesDue = (int)(dimesDue);
						System.out.println(intDimesDue + " Dime(s)");
						changeDue -= (intDimesDue * 0.10);
						dollarsOnly -= (intDimesDue * 0.10);
						
					}
					else if (changeDue < 0.10 && changeDue >=0.05) {
						nicklesDue = nicklesDue(changeDue);
						int intNicklesDue = (int)(nicklesDue);
						System.out.println(intNicklesDue + " nickle(s)");
						changeDue -= (intNicklesDue * 0.05);
						dollarsOnly -= (intNicklesDue * 0.5);
						
					}
					else if (changeDue < 0.05 && changeDue >0.01) {
						penniesDue = penniesDue(changeDue);
						int intPenniesDue = (int)(penniesDue);
						System.out.println(intPenniesDue + " Penny(ies)");
						changeDue -= (intPenniesDue * 0.01);
						dollarsOnly -= (intPenniesDue * 0.01);
						
						
					}
					else {
						break;
					}
			


	}
	}
		else if (moneyTendered == itemCost) {
			System.out.println("No change due!");
		}
	}
	public static int twentiesDue (int dollarsOnly) {
		int twentiesDue;
		twentiesDue = dollarsOnly/20;
		return twentiesDue;
		
	}
	public static int tensDue (int dollarsOnly) {
		int tensDue;
		tensDue = dollarsOnly/10;
		return tensDue;
		
	}
	public static int fivesDue (int dollarsOnly) {
		int fivesDue;
		fivesDue = dollarsOnly/5;
		return fivesDue;
		
	}
	public static int singlesDue (int dollarsOnly) {
		int singlesDue;
		singlesDue = dollarsOnly/1;
		return singlesDue;
		
	}
	public static double quartersDue (double changeDue) {
		double quartersDue;
		quartersDue = changeDue/0.25;
		return quartersDue;
		
	}
	public static double dimesDue (double changeDue) {
		double dimesDue;
		dimesDue = changeDue/0.10;
		return dimesDue;
		
	}
	public static double nicklesDue (double changeDue) {
		double nicklesDue;
		nicklesDue = changeDue/0.05;
		return nicklesDue;
		
	}
	public static double penniesDue (double changeDue) {
		double penniesDue;
		penniesDue = changeDue/0.01;
		return penniesDue;
		
	}
}
