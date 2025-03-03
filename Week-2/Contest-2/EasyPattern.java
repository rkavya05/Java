/*
Input Format
n = 5

Output Format
12345
678910
1112131415
1617181920
2122232425

Sample Input 0
3

Sample Output 0
123
456
789
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
