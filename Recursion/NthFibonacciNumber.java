//https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
class Solution {
    public int nthFibonacci(int n) {
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        else{
            return nthFibonacci(n-1)+nthFibonacci(n-2);
        }
    }
}
