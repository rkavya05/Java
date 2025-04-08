/*Given an array, print the sum or even values in the array.
Example n = 5 arr = [2, 3, 5, 6, 8]
Output: 16
So here the even values are 2,6, 8. So sum of them is 16.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
    }
}
