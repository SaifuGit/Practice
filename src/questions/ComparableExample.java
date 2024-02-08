package questions;

import java.io.*;
import java.util.*;
public class ComparableExample  {

	public static void main (String[] args) {	 
		
		int n = 4;
		Triplet arr[] = new Triplet[n];

		arr[0] = new Triplet(1, 2, 3);
		arr[1] = new Triplet(2, 2, 4);
		arr[2] = new Triplet(5, 6, 1);
		arr[3] = new Triplet(10, 2, 10);
 
		// Sorting the array
		//This sort we can directly do on INTEGER as it implements Comparable but we can not sort on
		//Triplet class until it implements Comparable interface and if implementing then we have to 
		//override compareto() method and write our logic.
		Arrays.sort(arr); 
		
		// printing the
		// Triplet array
		print(arr);		 
	}

	public static void print(Triplet[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	
}




class Triplet  implements Comparable<Triplet>{
	int x;
	int y;
	int z;

	public Triplet(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	@Override
	public int compareTo(Triplet o) {
		// TODO Auto-generated method stub
		//Here class itself has power to compare current object with other object and return 1 means
		//position swapped -1 means not swapped.
		return this.z>o.z?1:-1;
	}
	
	
}


	