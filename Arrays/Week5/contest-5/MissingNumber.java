/*You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n, in sorted order. Since there are only n-1 numbers in array,
there is one number missing from 1 to n. You need to find the number.arr[] = [1, 2, 3, 5]
Input Format
n = 5 arr[] = [1, 2, 3, 5]
Output Format
4
Sample Input 0
5
1 2 4 5
Sample Output 0
3*/

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
           arr[i]=sc.nextInt();
        }
        int SumOfGivenValues=0;
        for(int i=0;i<n-1;i++){
          SumOfGivenValues += arr[i];
        }
        int SumOfNaturalNumbers= n*(n+1)/2;
        int MissingNum= SumOfNaturalNumbers - SumOfGivenValues;
        System.out.print(MissingNum);
    }
}
