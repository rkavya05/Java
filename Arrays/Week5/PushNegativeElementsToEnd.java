//https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
class Solution {
    public void segregateElements(int[] arr) {
        int n=arr.length;
        int[] b=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                b[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<=-1){
            b[j]=arr[i];
            j++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=b[i];
        }
    }
}
