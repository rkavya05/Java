//https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
class Solution {
    public static Node reverseKGroup(Node head, int k) {
        int[] a = new int[100000];
        Node temp=head;
        while(temp!=null){
            int x=0;
            Node temp1=temp;
            while(x<k && temp!=null){
                a[x]=temp.data;
                x++;
                temp=temp.next;
            }
            x--;
            while(x>=0){
                temp1.data=a[x];
                temp1=temp1.next;
                x--;
            }
        }
        return head;
    }
}
