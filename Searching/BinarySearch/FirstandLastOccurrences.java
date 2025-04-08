//https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
public class Main
{
    public static int firstOccurance(int[] a,int x,int n){
        int i=0,j=n-1;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==x){
                ans = mid;
                j=mid-1;
            }else if(a[mid]>x){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }

    public static int lastOccurence(int[] a,int x,int n){
        int i=0,j=n-1;
        int ans=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==x){
                ans=mid;
                i=mid+1;
            }else if(a[mid]<x){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
	    int n=10;
		int[] a={1,2,2,3,3,3,3,5,6,6};
		int x=3;
		int First=firstOccurance(a,x,n);
        int Last=lastOccurence(a,x,n);
		System.out.print("FirstAndLastOccurance : "+First+" "+Last);
	}
}
