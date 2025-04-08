//https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
public class Main
{
	public static void main(String[] args) {
		int n=6;
		int [] a={0,1,2,3,4,5};
		int temp=a[n-1];
		for(int i=n-1;i>=1;i--){
		    a[i]=a[i-1];
		}
		a[0]=temp;
		for(int i=0;i<n;i++){
		    System.out.print(a[i]);
		}
		
	}
}
