/*Input Format

5

Constraints

1 <= n <= 100

Output Format

12345
22345
33345
44445
55555
Sample Input 0

3
Sample Output 0

123
223
333
Sample Input 1

5
Sample Output 1

12345
22345
33345
44445
55555  */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) {
                if (j <=i) {
                    System.out.print(i);
                } else {
                    System.out.print(j); 
                }
            }
            System.out.println(); 
        }
      
    }
}
