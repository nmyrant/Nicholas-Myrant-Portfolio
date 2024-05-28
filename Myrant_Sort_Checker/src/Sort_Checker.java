import java.util.Arrays;

public class Sort_Checker {
	// AscendCheck to check if array is sorted in ascending order
	public static boolean AscendCheck (int array[]) {
		boolean isSorted = true;
		for (int i = 0; i < array.length -1;) {
			if (array[i] > array [i+1]) {
				isSorted = false;
			    break;
			}
			 else {
				 isSorted = true;
				 i++;
			 }
		}
				return isSorted;	
	}
	// DescendCheck to check if array is sorted in descending order
	public static boolean DescendCheck (int array[]) {
		boolean isSorted = true;
		for (int i = 0; i < array.length -1;) {
			if (array[i] < array [i+1]) {
				isSorted = false;
			    break;
			}
			 else {
				 isSorted = true;
				 i++;
			 }
		}
				return isSorted;	
	}
	// SortCheck method to check weather array is sorted in ascending order, descending order
	// or, is not sorted at all.
	public static void SortCheck(int array[]) {
		if(AscendCheck(array) == true){
			System.out.println("This array is sorted in ascending order.\n");
		}
		else if(DescendCheck(array) == true) {
			System.out.println("This array is sorted in descending order.\n");
		}
		else {
			System.out.println("This array is not sorted.\n");
		}	
	}
	
	
	//  Main method to test functionality with a couple different arrays
	public static void main(String[] args) {
		int array1[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = {10,9,8,7,6,5,4,3,2,1};
		int array3[] = {4,5,8,9,3,2,1,10,6,7};
		
		// Prints results with arrays as is
		System.out.println("Array 1: " + Arrays.toString(array1));
		SortCheck(array1);
		System.out.println("Array 2: " + Arrays.toString(array2));
		SortCheck(array2);
		System.out.println("Array 3: " + Arrays.toString(array3));
		SortCheck(array3);

		// Sorts all of the arrays into ascending order
		System.out.println("\nNow sorting arrays with selection sort...\n\n");
		SelectionSort test = new SelectionSort();
		test.sort(array1);
		test.sort(array2);
		test.sort(array3);
		
		// Prints results after running arrays through selection sort
		System.out.println("Array 1: " + Arrays.toString(array1));
		SortCheck(array1);
		System.out.println("Array 2: " + Arrays.toString(array2));
		SortCheck(array2);
		System.out.println("Array 3: " + Arrays.toString(array3));
		SortCheck(array3);
		
		
		
	}

}
