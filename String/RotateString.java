//https://leetcode.com/problems/rotate-string/

class Solution {
    public boolean rotateString(String s, String goal) {
       for(int i=1;i<=s.length();i++){
            String var=s.substring(i)+s.substring(0,i);
            if(var.compareTo(goal)==0){
                return true;
            }
        }
        return false;
    }
}
