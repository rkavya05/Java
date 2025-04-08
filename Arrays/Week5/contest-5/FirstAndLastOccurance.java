/*Aloka is stuck in an island, she has a solve a problem to get out of the island. You are given n numbers in sorted order, you need to find the first and
last occurrence of the number x and print them. If occurrence of a number is not found, then print -1.
Input Format
n = 8 arr ={2,3,4,4,4,5,5,6} x = 4
Output Format
2 4
Sample Input 0
6
2 3 4 4 5 6
4
Sample Output 0
2
3*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first == -1) {
            System.out.println("-1");
        } else {
            System.out.println(first);
            System.out.println(last);
        }
    }
}
