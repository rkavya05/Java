//https://www.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
       Arrays.sort(a);
       Arrays.sort(b);
       ArrayList <Integer> res = new ArrayList<>();
       int i=0,j=0;
       while(i<a.length&&j<b.length){
           if(a[i]<b[j]){
               i++;
           }
           else if(b[j]<a[i]){
               j++;
           }
           else{
               if(res.size()==0 || res.get(res.size()-1)!=b[j]){
                   res.add(b[j]);
               }
               j++;
               i++;
           }
       }
       return res;
    }
}
