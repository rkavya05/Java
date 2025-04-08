//https://www.geeksforgeeks.org/problems/reverse-a-string/1
class Solution {
    public static String reverseString(String s) {
       char[] a = s.toCharArray();
        int i = 0, j = a.length - 1;
        while (i <= j) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        
        return new String(a);
    }
}
