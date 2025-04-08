//https://www.geeksforgeeks.org/problems/palindrome-string0817/1
class Solution {
    boolean isPalindrome(String s) {
        char[] s1=s.toCharArray();
        int i=0, j=s1.length-1;
        while(i<=j){
            char temp=s1[i];
            s1[i]=s1[j];
            s1[j]=temp;
            i++;
            j--;
        }
        if(s.equals(new String(s1))){
            return true;
        }
        else{
            return false;
        }
    }
}
