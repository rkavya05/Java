//https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
       int total =0;
       Node temp=head;
       while(temp!=null){
           total++;
           temp=temp.next;
       }
       if(k>total){
           return -1;
       }
       int x= total-k;
       temp=head;
       for(int i=0;i<x;i++){
           temp=temp.next;
       }
       return temp.data;
        
    }
}
