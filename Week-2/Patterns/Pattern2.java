/* Input : n=4
Output :
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4 
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
