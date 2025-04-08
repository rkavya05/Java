/*Pitsy needs help with the given task by her teacher. The task is to divide an array into two halves (left and right) containing n/2 elements each and do the sum of the each. half and then multiply both the sum. In case of odd number of elements, include the odd one in the second half.

Example1: arr =[1,2,3,4] Array has 4 elements so half is going to be 2 elements each, First half sum = 1 + 2 = 3 Second half sum = 3+ 4 = 7 So now to multiply them = 3 * 7 = 21

Example2: arr =[5,3,9,12,3] Array has 4 elements so half is going to be 2 elements each, First half sum = 5 + 3 = 8 Second half sum = 9 + 12 + 3 = 24 So now to multiply them = 8 * 24 = 192

Note: If the length of the array is odd then the right half will contain one element more than the left half.*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum1=0;
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int firsthalf=arr[i];
            sum1=sum1+firsthalf;
        }
       for(int i=n/2;i<n;i++){
            int Secondhalf=arr[i];
            sum=sum+Secondhalf;
        }
         int multiply = sum1*sum;
   System.out.print(multiply);
    }
}
