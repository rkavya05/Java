import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }        
           System.out.println(); 
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*n)-(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*Input : n = 4
Output : 
         *  
      *  *  *
   *  *  *  *  *  
*  *  *  *  *  *  *
   *  *  *  *  *  
      *  *  *
	*
*/
