package questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Factorials{
	int getfactorial(int num);
}
public class Q6 {
	
	public static void main(String[] args) {
//		Factorials fact=i->{
//			int res=1;
//			
//			for(int j=1;j<=i;j++) {
//				res*=j;
//			}
//			return res;
//		};
		int n=5;
		int s=IntStream.rangeClosed(1, n)
				.reduce(1, (result,i)->result*i);
		System.out.println(s);

		
		//check if the start with 1
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> l= myList.stream().filter(i->i.toString().startsWith("1")).collect(Collectors.toList());
		System.out.println(l);
		
		//find max
		List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,32);
		int r=myList2.stream().max(Integer::compareTo).get();

		System.out.println(r);
		
	}

}
