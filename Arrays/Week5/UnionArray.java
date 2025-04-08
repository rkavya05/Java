class Main{
    public static int unionArray(int a[],int[] res,int k){
        int n=a.length;
        for(int i=0;i<n;i++){
            int flag=1;
            for(int j=0;j<k;j++){
                if(a[i]==res[j]){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                res[k]=a[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        int[] a={1,3,5,7,3,2,6};
        int [] b={1,2,3,4,5,6,7};
        int n=a.length;
        int m=b.length;
        int[] res=new int[n+m];
        int k=0;
        //a [] array
        k=unionArray(a,res,k);
        for(int i=0;i<k;i++){
         System.out.print(res[i]+" ");
        }
        System.out.println();
        
        //b[] array
        k=unionArray(b,res,k);
        for(int i=0;i<k;i++){
         System.out.print(res[i]+" ");
        }
        
    }
}
