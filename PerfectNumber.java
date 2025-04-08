//Problem Link - https://www.geeksforgeeks.org/problems/perfect-numbers3207/1?utm_source=youtube&utm_medium=courseteam_practice_desc&utm_campaign=problem_of_the_day

class Solution {
    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=n){
                    sum = sum+n/i;
                }
            }
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
}
