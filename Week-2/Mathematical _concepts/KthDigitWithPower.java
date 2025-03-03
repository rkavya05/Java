// Finds the power of A power B and then finds the kth digit of the number
// Problem Link -https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/0
class Solution{
    static long kthDigit(int A,int B,int K){
        // code here
         long Power = (long)Math.pow(A,B);
         long i =1;
        while(Power>0){
            long LastDigit = Power % 10;
            if(K==i){
                return LastDigit;
            }
            i++;
           Power = Power/10;
        }
        return 0;
    }
}


// In online compilers use the below code

class Main {
    public static void main(String[] args) {
       int A = 3, B=3, k=1;
       long power=(long)Math.pow(A,B);
        long i=1;
        
        while(power>0){
            long ans=power%10;
            if(k==i){
                System.out.println(ans);
                break;
            }
            i++;
            power=power/10;
        }
        
       
    }
}
