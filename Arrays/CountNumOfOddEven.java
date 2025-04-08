class CountNumOfOddEven{
    public static void main(String[] args){
        int n=7,even=0,odd=0;
        int [] a={2,3,4,5,6,7,8};
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
