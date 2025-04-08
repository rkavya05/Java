//output:15
public class Main
{
	public static void main(String[] args) {
        int a[]={1,2,3,4,5};
		System.out.print(sumOfArray(a,5,0));
	}
	 static int sumOfArray(int a[],int n,int i) {
		if(i>=n) {
			return 0;
		}
		   return a[i]+sumOfArray(a, n, i + 1);
		
	}
}
