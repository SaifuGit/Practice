//Write a Java program to implement a lambda expression to find the sum of two integers.


package questions;

interface SumCalculator{
	  int sum(int a,int b);
	}
	// Main.java
	public class Q1 {
	    public static void main(String[] args) {
	        SumCalculator sumCalculator=(x,y)-> x+y;
	       int c= sumCalculator.sum(6,-7);
	       System.out.println("sum is "+ c);
	    }
	}
