// Solved using Dutch National Flag Algorithm
//https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
       int left=0,mid=0,right=arr.length-1;
       while(mid<=right){
           if(arr[mid]==0){
               int temp = arr[mid];
               arr[mid]=arr[left];
               arr[left]=temp;
               left++;
               mid++;
           }
           else if(arr[mid]==1){
               mid++;
           }
           else {
               int temp = arr[mid];
               arr[mid]=arr[right];
               arr[right]=temp;
               right--;
           }
       }       
    }
}
