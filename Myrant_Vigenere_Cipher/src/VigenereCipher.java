import java.util.Scanner;

public class VigenereCipher {

	public static void main(String[] args) {
		try(Scanner scnr = new Scanner(System.in)){
		char choice;
		AlphabetChart chart = new AlphabetChart(); // Initializing AlphabetChart so it fills
		
		// Greeting message explaining the program 
		System.out.println("Hello, and welcome to Vigenere's Cipher! This complex cipher will encrypt and dedcrypt your message.");
		
		// do while loop to repeat as long as the user chooses 'y', runs at least once
		do {
			System.out.println("Please input your message, then input what you want your key to be (use a string for the key).");
			// Getting user input
			System.out.print("Your message here: ");
			String message = scnr.nextLine();
			System.out.print("Your key here: ");
			String key = scnr.next();
		
			// Running the cipher with the users message and key
			vigenereCipher(message, key);
		
			System.out.println("\nDo you want to use the cipher again? 'y' yes any other key to exit");
			choice = scnr.next().charAt(0);
			scnr.nextLine();
		
		}
		while ((choice == 'y') || (choice == 'Y'));
		
		// Output indicating the program is over
		System.out.println("\nThank you for using the Vigenere Cipher!");
		}
	}
	
	
	public static void vigenereCipher(String message, String key) {
		// Converting the message to an upper case character array with no spaces 
		// or punctuation for further manipulation.
		char[] plainTextMessage = message.toUpperCase().replaceAll("[\\p{Punct}\\s]", "").toCharArray();
		
		// Converting the key to all upper case 
		char[] keyLetters = key.toUpperCase().toCharArray();
		
		// Creating 3rd blank char array to allow the original array to stay alive
		char[] formattedKey = new char[plainTextMessage.length];
		
		// Replacing the message with the key letters repeating
		for (int i = 0; i < plainTextMessage.length; i++) {	
			formattedKey[i] = keyLetters[i % keyLetters.length];
		}
		
		// Uses either the encrypt, or decrypt function from the alphabet chart class to transform 
		// the characters to whichever form is required.
		char[] cipheredMessage = new char[plainTextMessage.length];
		
		if (message.replaceAll("[\\p{Punct}\\s]", "") == message) {
			System.out.println("You already have a ciphertext!");
			for (int i = 0; i < plainTextMessage.length; i++) {
				cipheredMessage[i] = AlphabetChart.decrypt(plainTextMessage[i], formattedKey[i]);
				}
			message = new String(cipheredMessage);
			System.out.println("Your decrypted message is: " + message);
		}
		else {
			for (int i = 0; i < plainTextMessage.length; i++) {
				cipheredMessage[i] = AlphabetChart.encrypt(plainTextMessage[i], formattedKey[i]);
				}
			message = new String(cipheredMessage);
			System.out.println("Your encrypted message is: " + message);
		}
	}
	
	// Class for creating the 2d AlphabetChart with needed functions inside
	public static class AlphabetChart{
		// Creating the blank alphabet chart
		private static char[][] alphabetChart =  new char[26][26];
		
		// Filling the alphabet chart
		public AlphabetChart() {
		for (int i = 0; i < 26 ; i++) {
			for (int j = 0; j < 26; j++) {
				alphabetChart[i][j] = (char) (('A' - 'A' + j + i) % 26 + 'A');
				}
			}
		}
		// Function that takes two chars, and uses them to find
		// the result char in the 2d Alphabet where they intersect.
		public static char encrypt(char m, char k) {
			return alphabetChart[m - 'A'][k - 'A'];
			}
		public static char decrypt(char c, char k) {
			return alphabetChart[((c - k + 26) % 26)][0];
			}
		// Method for displaying the chart for testing purposes
		public static void display() {
		    for (int i = 0; i < 26; i++) {
		        for (int j = 0; j < 26; j++) {
		            System.out.print(alphabetChart[i][j] + " ");
		        	}
		        System.out.println(); // Move to the next line for the next row
		    		}
			}

	}
}
