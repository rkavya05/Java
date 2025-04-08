//https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n=4;
		int [] a={1,2,2,2};
		int j=0;
		for(int i=0;i<n-1;i++){
		    if(a[i]!=a[i+1]){
		        a[j]=a[i];
		        j++;
		    }
		}
		a[j]=a[n-1];
		j++;
		for(int i=0;i<j;i++){
		    System.out.print(a[i]+" ");
		}
	}
}
