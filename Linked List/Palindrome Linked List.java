//https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        Node temp =  null;
        Node currentnode = head;
        Node newnode;
        while(currentnode!=null){
            newnode = new Node(currentnode.data); // create new node to avoid modifying original list
            newnode.next = temp;
            temp = newnode;
            currentnode = currentnode.next;
        }
        Node temp1 = temp;
        currentnode = head;
        while(currentnode != null && temp1!=null){
        if(currentnode.data != temp1.data){
            return false;
        }
         currentnode = currentnode.next;
         temp1= temp1.next;
        }
       return true;
    }
}
