//Problem Link - https://www.geeksforgeeks.org/problems/special-odd-series-sum1235/1

class Solution {
    static long sumOfTheSeries(long n){
        int sum = 0, OddSeries = 0;
        for(int i=1;i<=2*n-1;i=i+2){
            sum=sum+i;
            OddSeries = OddSeries +sum;
        }
        return OddSeries;
    }
}
