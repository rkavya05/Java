//https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Solution {
    Node deleteNode(Node head, int x) {
        if(x==1){
            return head.next;
        }
        Node temp=head;
        while(temp!=null && x>2){
            temp = temp.next;
            x--;
        }
        if(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
    }
}
