//Problem Link - https://www.geeksforgeeks.org/problems/number-of-divisors1631/1?

import java.util.Scanner;
class PrimeNumberTillN
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = 6;
	    int count=0;
	   for(int i=1;i<=n;i++){
            if(n%i==0 && i%3==0){
            count++;
            }
                
        }
        
         System.out.print(count);
	}
}
