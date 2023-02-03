package programs;

import java.util.Scanner;

public class PriceCalculator {
	public static int calculate(String comboType,int quantity,int distance) {
		int total = 0;
		int comboPrice = 0;
		if(comboType.equalsIgnoreCase("v")) {
			comboPrice = 12;			
		}else {
			comboPrice = 15;
		}
		total = comboPrice * quantity;
		if(distance>3) {
			//first 3 KMs are free of charge
			distance = distance -3;
			//charges for Next 3KMs
			if(distance <=3) {
				total = total+ (distance*1);
			}else {
				//calculate 
				total = total + (3*1);
				total = total + ((distance-3)*2);
			}
			//charges for Remaining 3KMs
		}
		return total;
	}
	private static boolean isValidData(String comboType,int quantity,int distance) {
		if(!(comboType.equalsIgnoreCase("v")|| comboType.equalsIgnoreCase("n"))) {
			return false;
		}
		if(distance <= 0) {
			return false;
		}
		if(quantity < 1) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int totalBill = -1;		
		
		Scanner inScanner = new Scanner(System.in);  // Create a Scanner object
		
	    System.out.println("Enter ComboType (V/N)");
	    String comboType = inScanner.next();
	    
	    System.out.println("Enter Quantity");
	    Integer quantity = inScanner.nextInt();
	    
	    System.out.println("Enter Distance");
	    Integer distance = inScanner.nextInt();
		
	    if(isValidData(comboType, quantity, distance)) {
			totalBill = calculate(comboType, quantity, distance);	
		}
		System.out.println("Total Bill : "+totalBill);
		inScanner.close();
		System.exit(0);
		
	}
}


