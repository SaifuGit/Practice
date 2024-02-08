//Write a Java program to implement a lambda expression to check if a given string is a palindrome.
package questions;

interface Palindrome{
	boolean getPalindrome(String str);
}
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pre=s ->{ //return true;
			int start=0;
			int end=s.length()-1;
			while(start<end) {
				if(s.charAt(start)==s.charAt(end)) {
					start++;
					end--;
				}
				else {
					return false;
				}
			}
			return true;
		};
		System.out.println(pre.getPalindrome("aba"));

	}

}
