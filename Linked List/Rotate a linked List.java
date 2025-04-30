//https://www.geeksforgeeks.org/problems/rotate-a-linked-list/1
class Solution {
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0)
        return head;
        
        int n=1;
        Node ptr = head;
        Node tail = null;
        while(ptr.next!=null){
            n++;
            ptr = ptr.next;
        }
        tail = ptr;
        ptr =head;
        k=k%n;
        if(k==0){
            return head;
        }
        while (k > 1) {
            ptr = ptr.next;
            k--;
        }
        tail.next = head;
        
       Node  newhead = ptr.next;
        ptr.next = null;

        return newhead;
    }
}
