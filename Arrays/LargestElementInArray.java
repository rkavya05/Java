class LargestElement{
    public static void main(String[] args){
        int n=5;
        int [] a = {22,99,55,77,90};
        int largest=a[0];
        for(int i=1;i<n;i++){
            if(largest<a[i]){
                largest=a[i];
            }
            
        }
        System.out.print(largest);
    }
}
