// Problem Link - https://www.geeksforgeeks.org/problems/prime-number2314/1
class Solution {
    static boolean isPrime(int n) {
        boolean prime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
