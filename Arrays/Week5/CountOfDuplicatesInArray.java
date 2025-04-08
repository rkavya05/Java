import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    int n=9;
		int[] a={2, 3, 1, 6, 7, 4, 5, 0, 8};
		int count =0;
		Arrays.sort(a);
		for(int i=0;i<n-1;i++){
		    if(a[i]==a[i+1]){
		        count++;
		    }
		}
		System.out.print(count);
	}
}
