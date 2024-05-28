import java.util.Scanner;

public class RecursiveProduct {
			public static void multiplier(int userCount, long runningTotal, int count) { 
				Scanner scnr = new Scanner(System.in);
				// number declared to capture user input
				int userNumber;                                                              

				// base case for when the counter gets down to 0
				if (userCount == 0) {														 
					System.out.println("\nDone!");
					System.out.println("The product of your numbers is: " + runningTotal);
				}
				// recursive method asking user for next number, userCount times 
				// and multiplying it with the runningTotal
				else {
					System.out.print("Number " + count + ": ");
					userNumber = scnr.nextInt();
					runningTotal = runningTotal * userNumber;
					multiplier(userCount -1, runningTotal, count+1);
				}	
			}
			// main class that executes the code
			public static void main(String[] args) {	
				Scanner scnr = new Scanner(System.in);
				 int userCount;
				 int baseTotal = 1;
				 int baseCount = 1;
						 
			// Gathers users count	 
			System.out.println("Input a count");
			userCount = scnr.nextInt();	 
			System.out.println("\nInput " + userCount + " numbers to get the product of the numbers.\n");
			multiplier (userCount, baseTotal, baseCount);	
	}
}