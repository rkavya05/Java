// Problem Link - https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class Solution {
    int sumOfSeries(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum + i*i*i;
        }
        return sum;
    }
}
