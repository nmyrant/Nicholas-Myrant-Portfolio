import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class StudentSorter {
	public static void main(String[] args) {
		
		char choice = 'c';
		Scanner scnr = new Scanner(System.in);
		
		LinkedList<Student> sList =  new LinkedList<Student>();
	
		// Loop that allows user to input new info for student as long as they keep entering 'c'
		while (choice == 'c') {
			Student s = new Student("", "", 0);
			
			System.out.print("Please input a student name. \nName: ");
			s.setName(scnr.nextLine());
			
			System.out.print("Please input a student address. \nAddress: ");
			s.setAddress(scnr.nextLine());
			
			System.out.print("Please input a student GPA. \nGPA: ");
			s.setGPA(scnr.nextDouble());
			
			System.out.println("\nStudent added to list of students.");
			sList.add(s);
			
			System.out.println("Enter 'c' to continue or any other key to exit and view student list");
			choice = scnr.next().charAt(0);
			scnr.nextLine();     // Added this to consume the "" for even spacing on each iteration
			System.out.println("");
		}
		
		
		// Prints unsorted linked list
		System.out.println("Unsorted:");
		for (Student student : sList) {
			student.printInfo();
		}
		
		
		// Sorts the linked list based on name
		Collections.sort(sList, new NameComparitor());
		
		
		
		// Prints the now sorted array list, sorted by rollno
				System.out.println("\nSorted by name:");
				for (Student student : sList) {
					student.printInfo();
				}
				System.out.println(" ");
				for (Student student : sList) {
					student.writeInfo();
				}
					
				
	}

}
