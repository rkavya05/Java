//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
public class SearchAnElement {
    public static void main(String[] args){
        int n=10,x=9;
        int [] a={1,2,3,4,5,6,7,8,9,10};
        int flag =-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                flag = i;
            }
        }
        System.out.print(flag);
    }
}
