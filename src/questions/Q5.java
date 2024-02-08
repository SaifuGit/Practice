// Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
	
	public static void main(String[] args) {
		List<Integer> l=List.of(1,2,3,4,5,5,5,6,6,7,9);
		List<Integer> result = new ArrayList<Integer>();
		l.stream().distinct().collect(Collectors.toList()).forEach(result::add);
		l.stream()
        .reduce(1, (x, y) -> x * y)
        .intValue();
		System.out.println(result);
		
	}

}
