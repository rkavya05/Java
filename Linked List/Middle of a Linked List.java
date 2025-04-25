//https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution {
    int getMiddle(Node head) {
        Node temp,temp1;
        temp=head;
        temp1=head;
        if(head==null){
            return -1;
        }
        while(temp1!=null && temp1.next!=null){
            temp = temp.next;
            temp1 = temp1.next.next;
        }
            return temp.data;
    }
}
