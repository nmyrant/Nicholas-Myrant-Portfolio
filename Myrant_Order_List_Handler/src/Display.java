// Display class for copying queue into two arrays.
// One is sorted by name and one is sorted by number.
import java.util.ArrayList;
import java.util.List;

public class Display {
    private OrderQueue orderQueue;
    private List<CustomerOrder> numberSort;
    private List<CustomerOrder> nameSort;

    public Display(OrderQueue orderQueue) {
        this.orderQueue = orderQueue;
        this.numberSort = new ArrayList<>();
        this.nameSort = new ArrayList<>();
        updateArrays();
    }

    private void updateArrays() {
        numberSort.clear();
        nameSort.clear();

        // Copy orderQueue to orderByOrderNumber and orderByName lists
        for (CustomerOrder order : orderQueue.getOrders()) {
            numberSort.add(order);
            nameSort.add(order);
        }

        // Sort the lists based on order number and name respectively
        QuickSort.quickSortByOrderNumber(numberSort);
        QuickSort.quickSortByName(nameSort);
    
    }

    public void refresh() {
        updateArrays();
    }

    public List<CustomerOrder> getSortedByNumber() {
        return numberSort;
    }

    public List<CustomerOrder> getSortedByName() {
        return nameSort;
    }
    
    public void displayOrders(List<CustomerOrder> orders) {
        for (CustomerOrder order : orders) {
            System.out.println(order.orderNumber + ". " + order.customerName + " - $" + order.orderTotal);
        }
        System.out.println();
    }
}

