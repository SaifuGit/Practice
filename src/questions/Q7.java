package questions;

import java.util.List;
import java.util.Optional;

public class Q7 {
	
	public static void main(String[]  args) {
		
		List<Integer> list=List.of(2,3,5,5,9,6,6);
		//1st parameter in reduce is the initial value as well as optional value since datatype 
		//of sum is int we have to give an initial value
		int sum=list.stream().reduce(0, (x,y)->x+y).intValue();

		//else write like this
		Integer sum1=list.stream().reduce((x,y)->x+y).get();
		int mult=list.stream().reduce(1, (x,y)->x*y).intValue();
		System.out.println("sum: "+sum+" or "+sum1 +" product "+mult);
	}

}
