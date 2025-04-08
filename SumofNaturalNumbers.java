// problem Link - https://www.geeksforgeeks.org/problems/sum-of-series2811/1

class Solution {
    public static int seriesSum(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
