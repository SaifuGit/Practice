package questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		Triplet2 arr[] = new Triplet2[n];

		arr[0] = new Triplet2(1, 2, 3);
		arr[1] = new Triplet2(2, 2, 4);
		arr[2] = new Triplet2(5, 6, 1);
		arr[3] = new Triplet2(10, 2, 10);
		Comparator<Triplet2> comp =(i1,i2)-> i1.z>i2.z?1:-1;
		Arrays.sort(arr, comp);
		Stream.of(arr).forEach(System.out::println);
 

	}

}

class Triplet2{
	int x;
	int y;
	int z;

	public Triplet2(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	
	
}


	
