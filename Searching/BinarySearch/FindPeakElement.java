//https://leetcode.com/problems/find-peak-element/submissions/1596575038/
class Main {
    public static int peakElement(int[] a){
        int i=0,j=a.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(a.length==1){
                return 0;
            }
            if(mid==0){
                if(a[j]>a[i]){
                    return j;
                }
                else{
                    return i;
                }
            }
            if(a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
                return mid;
            }
            if(a[mid]>a[mid-1]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] a={1,2,1,3,5,6,4};
        int peak=peakElement(a);
        System.out.println("PeakElement : "+peak);
    }
}
