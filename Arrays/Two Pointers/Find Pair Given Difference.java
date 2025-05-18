//https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1
class Solution {
    public boolean findPair(int[] a, int x) {
       Arrays.sort(a);
       int i=0,j=1;
       while(i<a.length && j<a.length){
           if(a[j]-a[i]==x && i!=j){
               return true;
           }
           else if(a[j]-a[i]>x){
               i++;
           }
           else{
               j++;
           }
       }
       return false;
    }
}
