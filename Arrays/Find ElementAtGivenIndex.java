//https://www.geeksforgeeks.org/problems/c-array-print-an-element-set-25933/0

public class FindIndexOfElement {
    public static void main(String[] args){
        int n=5,x=2;//4 index element 5
        int [] a={1,2,3,4,5};
        int flag=-1;
        for(int i=0;i<n;i++){
            if(i==x){
                flag = a[i];
            }
        }
        System.out.print(flag);
    }
}
