package MakeChangeProject;

import java.util.Scanner;

public class MakeChangeProject {
	public static void main(String[] args) {
		double itemCost;
		double moneyTendered;
		double changeDue;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("How much is the item?: ");
		itemCost = scanner.nextDouble();
		
		System.out.print("How much money was tendered?: ");
		moneyTendered = scanner.nextDouble();
		
		if (moneyTendered < itemCost) {
			System.out.println("Not enough money");
		}
		else if (moneyTendered > itemCost) {
			int quartersDue;
			int dimesDue;
			int nicklesDue;
			int penniesDue;
			int twentyDollarBill;
			int tenDollarBill;
			changeDue = moneyTendered - itemCost;
			System.out.println("Your change is: " + changeDue);
				while (changeDue > 0) {
					if (changeDue > 1.0) {
						int dollarsOnly = (int)(changeDue);
						System.out.println(dollarsOnly); 
					}
				}
			
			//Dollars divided by $20, $10, ect, then change times 100, then 25cents, 10cents, ect.
			
			//Might need while loop, modulus
			
		}
		
		
		

	}
}
