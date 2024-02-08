//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

package questions;

import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > list=List.of("red","green", "balue", "black", "pink");
		List<String> l=list.stream().sorted().collect(Collectors.toList());
		List<String> l1=list.stream().sorted((s1,s2)->Character.compare(s1.charAt(1),s2.charAt(1))) 
				.collect(Collectors.toList());

		System.out.println(l);
		System.out.println(l1);

	}

}
