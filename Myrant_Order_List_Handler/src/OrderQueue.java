import java.util.LinkedList;
import java.util.Queue;

// Standard queue implementation using linked list
public class OrderQueue {
    private Queue<CustomerOrder> orderQueue;

    public OrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void enqueue(CustomerOrder order) {
        orderQueue.add(order);
    }

    public CustomerOrder dequeue() {
        return orderQueue.poll();
    }

    public boolean isEmpty() {
        return orderQueue.isEmpty();
    }

    public int size() {
        return orderQueue.size();
    }

    public void clear() {
        orderQueue.clear();
    }
    
    public Queue<CustomerOrder> getOrders() {
        return orderQueue;
    }
}
