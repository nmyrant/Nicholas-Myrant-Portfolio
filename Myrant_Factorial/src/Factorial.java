
public class Factorial {
		// Standard method for finding factorial
		public static int fact(int num) {	
			if (num <=1) {
				return 1;
			}
			else
				return num * fact(num -1);		
		}
		
		// Second method for finding factorial using tail recursion
		private static int fact2(int num, int accumulator) {
	        if (num <= 1) {
	            return accumulator;
	        } else {
	            return fact2(num - 1, num * accumulator);
	        }
	    }
		
		// tests both methods
		public static void main(String[] args) {
		int num = 5;
		
		System.out.println("1st factorial method: Factorial of " + num + " is " + fact(num) + ".");
		System.out.println("1st factorial method: Factorial of " + 0 + " is " + fact(0) + ".");
		System.out.println("\n2nd factorial method: Factorial of " + num + " is " + fact2(num, 1) + ".");
		System.out.println("2nd factorial method: Factorial of " + 0 + " is " + fact2(0, 1) + ".");
	}

}
