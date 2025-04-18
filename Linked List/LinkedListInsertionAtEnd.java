//https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1
lass Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
       Node newNode = new Node(x);

        // If the list is empty, make the new node the head
        if (head == null) {
            return newNode;
        }

        // Traverse to the end of the list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link the last node to the new node
        temp.next = newNode;
        return head;
    }
}
