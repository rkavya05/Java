//https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1

import java.util.Arrays;
public class Main
{
    public static int elementAppearsOnce(int[] a,int n){
         Arrays.sort(a);
        int i=0,j=n-2;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid%2==0){
                if(a[mid]==a[mid+1]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
            else{
                if(a[mid]==a[mid-1]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return a[i];
    }
	public static void main(String[] args) {
	    int n=9;
		int[] a={1,1,2,2,3,3,4,4,5};
		int miss=elementAppearsOnce(a,n);
		System.out.print("MissingElement : "+miss);
	}
}
