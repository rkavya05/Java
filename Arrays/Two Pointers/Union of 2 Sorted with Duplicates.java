//https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res= new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(res.size()==0 || res.get(res.size()-1)!=a[i]){
                    res.add(a[i]);
                }
                i++;
            }
            else if(b[j]<a[i]){
                if(res.size()==0|| res.get(res.size()-1)!=b[j]){
                    res.add(b[j]);
                }
                j++;
            }
            else{
                if(res.size()==0 || res.get(res.size()-1)!=a[i]){
                    res.add(b[j]);
                }
                j++;
                i++;
            }
        }
        while(i<a.length){
           if(res.size()==0 || res.get(res.size()-1)!=a[i]){
                    res.add(a[i]);
            }
             i++;
        }
        while(j<b.length){
            if(res.size()==0|| res.get(res.size()-1)!=b[j]){
                    res.add(b[j]);
            }
            j++;
        }
        return res;
    }
}
