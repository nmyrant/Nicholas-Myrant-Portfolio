import java.util.Scanner;

public class CaesarsCipher {

	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){

		//Greeting explaining program and asking user input
		System.out.println("Hello, and welcome to Caesar's Cipher! I "
				+ "can take any string you input and \nencrypt it with "
				+ "Caesar's Cipher!");
		System.out.println("Please input your string in proper ASCII format,"
				+ " and then input a number \nfor the rotation factor.");
		
		//Taking user input for the string and number
		System.out.println("Your string: ");
		String s = scnr.nextLine();
		System.out.println("Your number: ");
		int k = scnr.nextInt();
		
		//Output statement showing the string encrypted
		System.out.println("Your string, with a rotation factor of " + k + " in Caesar's Cipher, is:\n" 
				+ caesarsCipher(s, k) 
				//Goodbye statement to show program termination
				+ "\n\nGoodbye!");
	}
}
	
		public static String caesarsCipher(String s, int k) {
			
			//Converts the string to a character array
			char[] letters = s.toCharArray();
		
			//Adding rotation factor k to each letter
			for (int i = 0; i < letters.length; i++) {
			//Checks first if it is a letter to be converted
			if (Character.isLetter(letters[i])) {	
				 //Determine the base for wrapping ('a' for lowercase, 'A' for uppercase)
	            char base = Character.isLowerCase(letters[i]) ? 'a' : 'A';
	            //Perform the rotation and wrap around within the alphabet
	            letters[i] = (char) ((letters[i] - base + k) % 26 + base);
				}
			}
			
			s = new String(letters);
			
			return s;
		}			
}