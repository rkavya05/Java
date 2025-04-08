public class BubbleSort {
    public static void main(String args[]){
        int[] a={33,5,1,7,31};
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }   
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
