//https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
import java.util.Arrays;
public class Main
{
    public static int missingElement(int[] a,int n){
         Arrays.sort(a);
        int i=0,j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==mid+1){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i+1;
    }
	public static void main(String[] args) {
	    int n=10;
		int[] a={10,2,11,9,5,6,7,4,1,3};
		int miss=missingElement(a,n);
		System.out.print("MissingElement : "+miss);
	}
}
