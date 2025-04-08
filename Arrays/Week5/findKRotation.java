//https://www.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    public int findKRotation(List<Integer> arr) {
        int index=-1;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                index=i;
                break;
            }
        }
        if(index!=-1){
            return index+1;
        }else{
            return 0;
        }
    }
}
