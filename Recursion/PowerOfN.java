/* Write a Program to find the power of a number recursively. Take two inputs, number and the power.

Example1:
Input: 2 3
Output: 8
Explanation : 2^3 is 8

Example2 :
Input: 5 2
Output: 25
Explanation: 5^2 is 25*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=2,power=3;
		System.out.print(powerOfN(n,power));
	}
	 static int powerOfN(int n,int power) {
		if(power==0) {
			return 1;
		}
	   return n* powerOfN(n,power-1); 
		  
		
	}
}
