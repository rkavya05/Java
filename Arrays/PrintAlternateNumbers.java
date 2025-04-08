//https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1
class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> AlternateNum = new ArrayList<>();
        for(int i=0;i<arr.length;i=i+2){
            AlternateNum.add(arr[i]);
        }
       return AlternateNum;
    }
}
