public class SelectionSort
{
    void sort(int array[]) {
      // One by one move boundary of unsorted sub-array
        for (int i = 0; i < array.length-1; i++) {
        	
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }
}