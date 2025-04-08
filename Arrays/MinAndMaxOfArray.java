//https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
import java.util.Scanner;
class MinAndMax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int [] a = new int[n];
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
        int Min = a[0];
        int Max = a[0];
        for( i=0;i<n;i++)
        {
            if(Min>a[i]){
                Min=a[i];
            }
            if(Max<a[i]){
                Max=a[i];
            }
            
        }
      System.out.print(Min+" "+Max);
    }
}
