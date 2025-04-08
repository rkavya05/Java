// Problem Link = https://www.geeksforgeeks.org/problems/special-series-sum0903/1

class Solution {
    static long sumOfTheSeries(long n){
        int sum=0 , SeriesTerm = 0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            SeriesTerm = SeriesTerm+sum;
        }
        return SeriesTerm;
    }
}
