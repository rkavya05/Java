//https://www.geeksforgeeks.org/problems/remove-every-kth-node/1
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next = prev.next.next;
                count = 0;
            }
            if(count!=0){
                prev=temp;
            }
            temp = prev.next;
        }
        return head;
        
    }
}
