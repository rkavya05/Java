//Problem Link - https://www.geeksforgeeks.org/problems/squares-difference0939/1
class Solution {
    static long squaresDiff(int N){
      long SumOfSquare=0;
      long Sum = 0;
      for(int i=1;i<=N;i++){
          SumOfSquare += (long) Math.pow(i,2);
          Sum +=i;
      }
      long diff=SumOfSquare-(long) Math.pow(Sum,2);
      return Math.abs(diff);
    }
}
