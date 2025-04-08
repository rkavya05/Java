/*Write a program to print the divisors of a number recursively.

Example1:
Input: 6
Output: 1 2 3 6

Example 2:
Input: 12
Output: 1 2 3 4 6 12*/

public class Main
{
	public static void main(String[] args) {
        int n=6;
		DivisorsOfNumber(n,1);
	}
	 static void DivisorsOfNumber(int n,int i) {
		if(i> n) {
			return ;
		}
		if(n%i==0){
		    System.out.print(i);
		}
	    DivisorsOfNumber( n, i + 1);
		  
		
	}
}
