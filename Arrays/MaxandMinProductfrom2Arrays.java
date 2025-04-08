//https://www.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/0

public class MinMax {
    public static void main(String[] args){
        int [] arr1={5, 7, 9, 3, 6, 2};
        int [] arr2={1, 2, 6, 1, 9};
        int Max=arr1[0];
        int Min=arr2[0];
        for(int i=0;i<arr1.length;i++){
            if(Max<arr1[i]){
                 Max=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(Min>arr2[i]){
                Min=arr2[i];
            }
        }
        int Multi = Min*Max;
        System.out.print(Multi);
    }
}
