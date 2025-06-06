//https://leetcode.com/problems/first-bad-version/
//Hint:FirstOccurance
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1,high=n,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
