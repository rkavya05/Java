//https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int [] a={2,4,1,3,5};
		int Count=0;
		//comparing array
		for(int i=0;i<n-1;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i]>a[j]){
		            Count++;
		        }
		    }
		}
		System.out.print(Count);
	}
}
