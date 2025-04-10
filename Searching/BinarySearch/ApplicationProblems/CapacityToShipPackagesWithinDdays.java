//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class Solution {
    public int getdays(int[] weights,int capacity){
        int days=1,n=weights.length,sum=0;
        for(int i=0;i<n;i++){
            if(sum + weights[i] <=capacity){
                sum = sum+weights[i];
            }else{
                sum=weights[i];
                days++;
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=weights[0],high=0,n=weights.length;
        for(int i=0;i<n;i++){
            low = Math.max(weights[i],low);
            high=high+weights[i];
        }
        int ans=low;
        while(low<=high){
            int mid=(low+high)/2;
            int day=getdays(weights,mid);
            if(day<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
