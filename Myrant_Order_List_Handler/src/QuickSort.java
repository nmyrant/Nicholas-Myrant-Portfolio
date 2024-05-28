// Implementation of a standard quick sort method with
// Specific methods sort sort by name or order number.
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuickSort {
    public static void quickSortByOrderNumber(List<CustomerOrder> orders) {
        quickSort(orders, Comparator.comparingInt(o -> o.orderNumber));
    }

    public static void quickSortByName(List<CustomerOrder> orders) {
        quickSort(orders, Comparator.comparing(o -> o.customerName));
    }

    private static void quickSort(List<CustomerOrder> orders, Comparator<CustomerOrder> comparator) {
        quickSortRecursive(orders, 0, orders.size() - 1, comparator);
    }

    private static void quickSortRecursive(List<CustomerOrder> orders, int low, int high, Comparator<CustomerOrder> comparator) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high, comparator);
            quickSortRecursive(orders, low, pivotIndex - 1, comparator);
            quickSortRecursive(orders, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(List<CustomerOrder> orders, int low, int high, Comparator<CustomerOrder> comparator) {
        CustomerOrder pivot = orders.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(orders.get(j), pivot) < 0) {
                i++;
                Collections.swap(orders, i, j);
            }
        }

        Collections.swap(orders, i + 1, high);
        return i + 1;
    }
}
