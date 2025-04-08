//true
public class Main
{
	public static void main(String[] args) {
        int a[]={1,2,3,4,5};
		System.out.print(checkSortedArray(a,5,0));
	}
	 static boolean checkSortedArray(int a[],int n,int i) {
		if(i>=n-1) {
			return true;
		}
		if(a[i]>a[i+1]){
		    return false;
		}
		   return checkSortedArray(a, n, i + 1);
		
	}
}
