import java.util.*;
	
public class NameComparitor implements Comparator {
		// Compares student objects specifically with type name
		// returns 0 if =, -1 if s1 > s2, and 1 if s1 > s2
		public int compare(Object o1, Object o2) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			return(s1.getName().compareTo(s2.getName()));		
		}	
	} 