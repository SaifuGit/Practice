//24. Write a Java program to implement a lambda expression to find the largest prime factor
//of a given number.


package questions;

import java.util.function.Predicate;

interface Factor{
	boolean getLargestPrimeFactor(int num);
}

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1251;
		Factor pred=x->{
			for(int i=2;i<Math.sqrt(x);i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		};
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(pred.getLargestPrimeFactor(i)) {
				if(num%i==0) {
					num/=i;
					i--;
				}
			}
		}
		System.out.println(num);

	}

}
