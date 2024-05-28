import java.io.FileWriter;
import java.io.IOException;

public class Student {

	  private  String name;
	  private String address;
	  private Double GPA;
	
	// Constructor 
	Student(String name, String address, double GPA){	
		this.name = name;
		this.address = address;
		this.GPA = GPA;
	}
	
	public String getName() {return name;}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {return address;}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Double getGPA() {return GPA;}
	
	public void setGPA(Double GPA) {
		this.GPA = GPA;
	}
	
	

	// Method to print all attributes for a student
	public void printInfo() {
		System.out.println("Name: " + name + ". " 
						 +"Address: " + address + "." 
						 +" GPA: " + GPA + ".");
	}
	
	public void writeInfo() {
		try {	
			FileWriter fileWriter = new FileWriter("Student_List", true);
			
			fileWriter.write("\nName: " + name + ". " 
					 +"Address: " + address + "." 
					 +" GPA: " + GPA + ".");
			
			fileWriter.close();
			
			System.out.println("Succesfully wrote student to Student_List");
		}
		
		catch (IOException e){	
			System.out.println("Failed to write student to Student_List");	
		}
	}	
}