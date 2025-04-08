//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
      ArrayList<Integer> res=new ArrayList<>();
       Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
		    if(arr[i]==arr[i+1]){
		        res.add(arr[i]);
		    }
		}
		return res;
    }
}
