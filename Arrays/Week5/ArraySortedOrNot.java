//https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
