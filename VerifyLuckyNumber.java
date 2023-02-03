package programs;

import java.util.Scanner;
public class VerifyLuckyNumber {
	
		private static String verify(int numb) {
			
			String numbString = Integer.toString(numb);
			int total = 0;		
			for(int i = 0 ; i< numbString.length();i++) {
				int indexValue = i+1;
				if(indexValue % 2 ==0) {
					int placeValue = Integer.parseInt(""+numbString.charAt(i));
					total = total + (placeValue*placeValue);
				}
			}
			if(total !=0 && total % 9 == 0) {
				return "The number "+numb+" is a lucky number";
			}
			 return "The number is not a lucky number";
		}
		
		public static void main(String[] args) {
			Scanner inScanner = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter Number");
		    Integer inputNumb = inScanner.nextInt();
			System.out.println(verify(inputNumb));
			inScanner.close();		
			System.exit(0);
		}		
	}
