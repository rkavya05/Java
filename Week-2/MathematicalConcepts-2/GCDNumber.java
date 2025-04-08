// Problem Link - https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1

class Solution {
    public static int gcd(int a, int b) {
       while(a!=b){
           if(a>b){
               a=a-b;
           }
           if(b>a){
               b=b-a;
           }
       }
       return a;
    }
}
