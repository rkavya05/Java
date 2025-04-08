import java.util.Arrays;
class Sorting
{
    public static void mergeSortDivide(int[] a,int start,int last){
        if(last-start==1)
        return;
        
        int mid=(start+last)/2;
        mergeSortDivide(a,start,mid);
        mergeSortDivide(a,mid,last);

        mergeSortConquer(a,start,mid,last);
    }
    public static void mergeSortConquer(int[] a,int first,int middle,int end){
        int[] joined=new int[end-first];
        int i=first,j=middle,k=0;
        while(i<middle && j<end){
            if(a[i]<a[j]){
                joined[k++]=a[i++];
            }else{
                joined[k++]=a[j++];
            }
        }
        while(i<middle){
            joined[k++]=a[i++];
        }
        while(j<end){
            joined[k++]=a[j++];
        }
        for(k=0;k<joined.length;k++){
            a[first+k]=joined[k];
        }
    }
}

public class Main{
    public static void main(String[] args) {
	    int[] input={9,6,4,2,4,1,3};
	  Sorting.mergeSortDivide(input,0,input.length);
		System.out.println(Arrays.toString(input));
	}
}
