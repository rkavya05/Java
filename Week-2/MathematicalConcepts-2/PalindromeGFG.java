//Problem Link- https://www.geeksforgeeks.org/problems/palindrome0746/1

class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int original = n;
        int Sum = 0;
        while (n>0){
            int LastDigit = n%10;
            Sum = Sum*10+ LastDigit;
            n=n/10;
        }
            if(original==Sum){
                return true;
            }
            else{
                return false;
            }
    }
}
