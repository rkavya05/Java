//https://www.geeksforgeeks.org/problems/key-pair5616/1
class Solution {
    boolean twoSum(int a[], int target) {
        Arrays.sort(a);
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]+a[j]>target){
                j--;
            }else if(a[i]+a[j]<target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
