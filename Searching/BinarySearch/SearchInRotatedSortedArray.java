//https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
public class RotatedArray
{
    public static int searchIndex(int[] a,int n,int key){
        int i=0,j=n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[i]<a[mid]){
                if(key>=a[i] && key<a[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
            else{
                if(key<=a[j] && key >a[mid]){
                    i=mid+1;
                }
                else{
                    j=mid-1;
                }
            }
        }
        return -1;
    }    
	public static void main(String[] args) {
	    int n=10;
		int[] a={8,9,11,14,21,30,1,2,3,4};
		int key=2;
		int index=searchIndex(a,n,key);
		System.out.print("Index : "+index);
	}
}
