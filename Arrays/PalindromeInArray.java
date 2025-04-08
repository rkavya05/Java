//https://www.geeksforgeeks.org/problems/perfect-arrays4645/1

public class palindromeArray {
    public static void main(String[] args){
        int n=5;
        int [] a={1, 2, 3, 2, 1};
        int flag=0;
        for(int i=0;i<n/2;i++){
            if(a[i]!=a[n-1-i]){
                flag=1;
                break;
            }        
        }
        if(flag==0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
