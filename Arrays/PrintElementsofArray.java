//https://www.geeksforgeeks.org/problems/print-elements-of-array4910/1

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i;
        int [] arr= new int[n];
        for(i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
            System.out.print(arr[i]);
        }
    }
}
