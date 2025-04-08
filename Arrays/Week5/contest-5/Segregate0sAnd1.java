/*Given an array arr consisting of only 0's and 1's in random order. Modify the array to segregate 0s onto the left side and 1s onto the right side of the array.
Input Format
n = 5 arr[] = [0, 0, 1, 1, 0]
Output Format
0 0 0 1 1
Sample Input 0
5
0 1 0 1 0
Sample Output 0
0 0 0 1 1*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left=0, right=n-1;
        while(left<=right){
            if(arr[left]==0){
                left++;
            }else if(arr[right]==1){
                right--;
            }else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
