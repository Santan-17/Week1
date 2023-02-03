package programs;

import java.util.Scanner;

public class RabbitsandChicken {

	public static void main(String[] args) {
     Scanner SC= new Scanner(System.in);
     int legs,heads,TH,l,chicken,rabbits;
     System.out.println("Enter number of Heads");
     heads=SC.nextInt();
     System.out.println("Enter number of Legs");
     legs=SC.nextInt();
     TH= heads*2;
     l=legs-TH;
     
     if(l%2==0) {
    	 rabbits = l/2;
    	 chicken = heads-rabbits;
    	 System.out.println("number of rabbits:"+rabbits);
    	 System.out.println("number of chicken:"+chicken);
    	 
     }
     else {
    	 System.out.println("Enter valid pair");
     }

	}

}
