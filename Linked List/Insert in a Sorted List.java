//https://www.geeksforgeeks.org/problems/insert-in-a-sorted-list/1
class Solution {
    Node sortedInsert(Node head, int key) {
        Node temp = head;
         while(temp.next!=null && temp.next.data<key){
            temp=temp.next;
        }
        Node newnode = new Node(key);
        if(temp.data>key){
            newnode.next=head;
            return newnode;
        }
        newnode.next = temp.next;
        temp.next =newnode;
         return head;
    }
}
