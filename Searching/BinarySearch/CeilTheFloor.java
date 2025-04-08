//https://www.geeksforgeeks.org/problems/ceil-the-floor2802/0

class Solution {
     static int findFloor(int[] arr,int x){
         int n=arr.length;
        int i=0,j=n-1;
        
        int ans=-1;//no index
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<=x){
                ans = arr[mid];
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
     static int findCeil(int[] arr,int x){
        int n=arr.length;
        int i=0,j=n-1;
        int ans=-1;//no index
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]>=x){
                ans = arr[mid];
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
     public int[] getFloorAndCeil(int x,int[] arr) {
         Arrays.sort(arr); 
        return new int[]{findFloor(arr, x), findCeil(arr, x)};
    }
}
