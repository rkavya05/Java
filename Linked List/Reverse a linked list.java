//https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1
class Solution {
    Node reverseList(Node head) {
        Node temp=null;
        Node currentnode = head;
        Node newnode;
        while(currentnode!=null){
            newnode = currentnode.next;
            currentnode.next = temp;
            temp = currentnode;
            currentnode = newnode;
        }
        return temp;
    }
}
