//Write a program that gets n as input and print all the prime numbers till that number

import java.util.Scanner;
class PrimeNumberTillN
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   for(int i=2;i<=n;i++){
	       boolean prime = true;
	       for(int j=2;j<=i/2;j++){
	           if(i%j==0){
	               prime = false;
	               break;
	           }
	       }
	       if(prime==true){
	           System.out.print(i);
	       }
	   }
        
	}
}
