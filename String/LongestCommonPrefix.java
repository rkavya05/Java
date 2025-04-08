//https://leetcode.com/problems/longest-common-prefix/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int index=0;
        while(index<first.length()){
            if(first.charAt(index)==last.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        if(index==0){
            return "";
        }
        else{
            return first.substring(0,index);
        }
    }
}
