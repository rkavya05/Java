//https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1
class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
