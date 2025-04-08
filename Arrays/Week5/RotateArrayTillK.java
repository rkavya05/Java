//https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k = k%n;
        int[] b=new int[n];
        int j=0;
       
        for(int i=n-k;i<n;i++){
            b[j]=nums[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            b[j]=nums[i];
            j++;
        }
        for(int i=0;i<n;i++){
            nums[i]=b[i];
        }
    }
}
