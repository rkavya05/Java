//output:2
public class Main
{
	public static void main(String[] args) {
        int a[]={100,20,3,42,899};
		System.out.print(arrayIndex(a,5,0,3));
	}
	 static int arrayIndex(int a[],int n,int i,int target) {
		if(i>=n) {
			return -1;
		}
		if(a[i]==target){
		    return i;
		}
		else{
		   return arrayIndex(a, n, i + 1,target);
		}
	}
}
