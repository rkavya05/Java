//Problem Link - https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1

class Solution {
    static int findNthTerm(int n) {
        int sum =0;
       for(int i=1;i<=n;i++){
           sum=sum+i;
       }
       return sum;
    }
}
