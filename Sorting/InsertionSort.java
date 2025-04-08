public class InsertionSort {
    public static void main(String[] args){
        int [] a={5,6,3,2,8,1};
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
        }
    }
}
