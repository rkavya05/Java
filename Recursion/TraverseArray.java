// output:1 2 3 4 5 
public class Main
{
	public static void main(String[] args) {
        int a[]={1,2,3,4,5};
		arraytraverse(a,5,0);
	}
	 static void arraytraverse(int a[],int n,int i) {
		if(i>=n) {
			return;
		}
		System.out.print(a[i]+" ");
		arraytraverse(a, n, i + 1);
	}
}
