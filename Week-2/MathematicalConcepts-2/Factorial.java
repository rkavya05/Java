//Problem Link - https://www.geeksforgeeks.org/problems/factorial5739/1

class Solution {
    static int factorial(int n) {
        // code here
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
