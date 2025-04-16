//https://leetcode.com/problems/split-array-largest-sum/
class Solution {
    public int getSplit(int[] arr,int cap){
        int days=1,n=arr.length,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]<=cap){
                sum += arr[i];
            }
             else{
                 sum = arr[i];
                 days++;
                }
        }
        return days;
    }
    public int splitArray(int[] arr, int k) {
        int low=arr[0],high=0,n=arr.length;
        for(int i=0;i<n;i++){
            low = Math.max(arr[i],low);
            high = high +arr[i];
        }
        int ans=low;
        while(low<=high){
            int mid = (low+high)/2;
            int split=getSplit(arr,mid);
            if(split <= k)
            {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
