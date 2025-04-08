/* Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.
Examples:  
Input : L = 10, R = 20
Output : Sum = 60
Prime numbers between [10, 20] are:
11, 13, 17, 19
Therefore, sum = 11 + 13 + 17 + 19 = 60
Input : L = 15, R = 25
Output : Sum = 59 */
//Note: Use sieve of eratosthenes to solve the problem

import java.util.Scanner;
public class SumOfPrimeBetweenRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();//L=15
        int R=sc.nextInt();//R=25
        int n=R;
        int [] a=new int[n+1];
        for(int i=2;i<=n;i++){
            a[i]=1;
        }    
        for(int i=2;i*i<=n;i++)
        {
            if(a[i]==1)
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                a[j]=0;
                }
            }
        }
        int sum=0;
        for(int i=L;i<=R;i++){
            if(a[i]==1){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println(sum);//59
    }
}
