// Customer order object holding Customer order number, name, and total
public class CustomerOrder {
	private static int nextOrderNumber = 1;
	
	public String customerName = "";
	public int orderNumber = 0;
	public double orderTotal = 0.00;
	
	
	public CustomerOrder(String customerName, double orderTotal) {
		this.orderNumber = nextOrderNumber++;
		this.orderTotal = orderTotal;
		this.customerName = customerName;
	}
}
