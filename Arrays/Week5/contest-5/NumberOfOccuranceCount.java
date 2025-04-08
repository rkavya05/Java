/*Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[].
Input Format
n = 7 arr[] = [1, 1, 2, 2, 2, 2, 3] target = 2
Output Format
4
Sample Input 0
10
3 4 5 5 5 5 5 7 8 9
5
Sample Output 0
5*/

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
      System.out.print(count);
    }
}
