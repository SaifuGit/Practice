//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

package questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Q3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=List.of(3,4,5,6,7,7,7,7);
		List<Integer> evenList=l.stream().filter(x->x%2==0).collect(Collectors.toList());
		List<Integer> oddList=l.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(evenList);
		System.out.println(oddList);

		

	}

}
