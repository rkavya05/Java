//https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
class Solution {

    public void printNos(int n) {
       if(n==0){
           return;
       }
       else{
           printNos(n-1);
           System.out.print(n+" ");
       }
    }
}
