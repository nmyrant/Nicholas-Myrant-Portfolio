import java.util.List;
import java.util.Scanner;
public class OrderHandler {
	public static void main(String[] args) {
		// Creating a handful of orders
		CustomerOrder order1 = new CustomerOrder("Smith", 20.21);
		CustomerOrder order2 = new CustomerOrder("Hope", 15.70);
		CustomerOrder order3 = new CustomerOrder("Reeves", 12.01);
		CustomerOrder order4 = new CustomerOrder("Andrews", 5.60);
		CustomerOrder order5 = new CustomerOrder("Adams", 25.50);
		CustomerOrder order6 = new CustomerOrder("Connor", 13.12);
		CustomerOrder order7 = new CustomerOrder("Reid", 5.67);
		CustomerOrder order8 = new CustomerOrder("Cook", 8.12);
		CustomerOrder order9 = new CustomerOrder("Piper", 14.50);
		CustomerOrder order10 = new CustomerOrder("Herera", 12.20);
		CustomerOrder order11 = new CustomerOrder("Dunn", 19.47);
		CustomerOrder order12 = new CustomerOrder("Ferguson", 10.09);
		CustomerOrder order13 = new CustomerOrder("Bloom", 2.20);
		CustomerOrder order14 = new CustomerOrder("Armstead", 13.12);
		CustomerOrder order15 = new CustomerOrder("Bush", 5.60);
		CustomerOrder order16 = new CustomerOrder("Castleberry", 12.01);
		CustomerOrder order17 = new CustomerOrder("Braden", 20.21);
		
		// Loading the queue with the orders
		OrderQueue queue1 = new OrderQueue();
		queue1.enqueue(order1);
		queue1.enqueue(order2);
		queue1.enqueue(order3);
		queue1.enqueue(order4);
		queue1.enqueue(order5);
		queue1.enqueue(order6);
		queue1.enqueue(order7);
		queue1.enqueue(order8);
		queue1.enqueue(order9);
		queue1.enqueue(order10);
		queue1.enqueue(order11);
		queue1.enqueue(order12);
		queue1.enqueue(order13);
		queue1.enqueue(order14);
		queue1.enqueue(order15);
		queue1.enqueue(order16);
		queue1.enqueue(order17);
		
		Display display = new Display(queue1);
		
		
		
		// Menu for the user to chose options
		char choice = ' ';
		String name = " ";
		double total = 0.00;
		
		Scanner scnr = new Scanner(System.in);
		
		while(choice != '0') {
		System.out.println("Hello, and welcome to Nick's online retailer. Please choose an option below. "
		+ "\n'1': Add an order. "
		+ "\n'2': Remove an order"
		+ "\n'3': View order list."
		+ "\n'0' to abort.");
		
		choice = scnr.nextLine().charAt(0);
		
		switch (choice) {
        case '1': // Add an order
            // Takes the user input for their name and order total
        	System.out.print("Please input a name for your order followed by your total.\nName: "); 
            name = scnr.nextLine();
            System.out.print("Order total: "); 
            total = scnr.nextDouble();
            scnr.nextLine();
            // Creates a new CustomerOrder object with the user input and adds it to the queue
            CustomerOrder newOrder = new CustomerOrder(name, total);
            queue1.enqueue(newOrder);
            
            System.out.println("\nYour order has been added.\n");
            break;
            
        case '2': // Remove an order
        	//Removes the next order in line
        	queue1.dequeue();
        	System.out.println("\nNext order in queue removed.\n");
        	
            break;
        case '3': // View order list
        	// Displays the arrays sorted by number and by name
        	display.refresh();
        	System.out.println("\nOrders sorted by order number:");
            List<CustomerOrder> orderByNumber = display.getSortedByNumber();
            display.displayOrders(orderByNumber);

            System.out.println("\nOrders sorted by customer name:");
            List<CustomerOrder> orderByName = display.getSortedByName();
            display.displayOrders(orderByName);
        	
            break;
        case '0': // '0' to abort
        	System.out.println("\nGoodbye.");
            break;
        default: // If the user picks something other than the options provided
            System.out.println("\nInvalid choice. Please try again.\n");
            break;
		}
		
	}

}
	
}
