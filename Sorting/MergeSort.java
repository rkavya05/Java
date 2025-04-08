import java.util.Arrays;
class Sorting
{
    public static int[] mergeSortDivide(int[] a){
        if(a.length==1)
        return a;
        int mid=a.length/2;
        int[] left=mergeSortDivide(Arrays.copyOfRange(a,0,mid));
        int[] right=mergeSortDivide(Arrays.copyOfRange(a,mid,a.length));
        return mergeSortConquer(left,right);
    }
    public static int[] mergeSortConquer(int[] first,int[] second){
        int[] joined=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            joined[k]=first[i];
             k++;
            i++;
           
        }else{
            joined[k]=second[j];
             k++;
            j++;
        }
        }
        while(i<first.length){
            joined[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            joined[k]=second[j];
            k++;
            j++;
        }
        return joined;
    }
}

public class Main{
    public static void main(String[] args) {
	    int[] input={9,6,8,2,4,1,3};
	    input=Sorting.mergeSortDivide(input);
		System.out.println(Arrays.toString(input));
	}
}
