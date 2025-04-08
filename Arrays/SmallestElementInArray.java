class SmallestElement{
    public static void main(String[] args){
        int n=5;
        int [] a = {1,3,5,7,8};
        int Smallest=a[0];
        for(int i=1;i<n;i++){
            if(Smallest>a[i]){
                Smallest=a[i];
            }
            
        }
        System.out.print(Smallest);
    }
}

//solution-2
import java.util.Scanner;
class SmallestElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int [] a = new int[n];
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
        int Smallest = a[0];
        for( i=0;i<n;i++)
        {
            if(Smallest>a[i]){
                Smallest=a[i];
            }
            
        }
      System.out.print(Smallest);
    }
}
