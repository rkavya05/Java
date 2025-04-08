//https://www.geeksforgeeks.org/problems/anagram-1587115620/1

import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        String s1="LISTEN";
        String s2="SILENT";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if(s1.length()!=s2.length()){
            System.out.print("not an anagram");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                System.out.print("not an anagram");
            }
            else{
                break;
            }
        }
        System.out.print("It is an anagram");
    }
}
