//https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
class Solution {
    public static int findUnion(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        int[] res=new int[n+m];
        int k=0;
        for(int i=0;i<n;i++){
            int flag=1;
            for(int j=0;j<k;j++){
                if(a[i]==res[j]){
                   flag=0;
                    break;
                }
            }
            if(flag==1){
                res[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<m;i++){
            int flag=1;
            for(int j=0;j<k;j++){
                if(b[i]==res[j]){
                   flag=0;
                    break;
                }
            }
            if(flag==1){
                res[k]=b[i];
                k++;
            }
        }
        return k;
    }
}
