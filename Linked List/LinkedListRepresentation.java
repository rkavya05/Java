class Node{
    int data;
    Node next;
}

public class Main
{
	public static void main(String[] args) {
	    Node head1 = new Node();
	    head1.data = 4;
	    head1.next=null;
		System.out.println(head1.data);
		Node head2 = new Node();
		head2.data=6;
		head1.next=head2;
		System.out.println(head1.next.data);
		Node head3 = new Node();
		head3.data=8;
		head2.next=head3;
		System.out.println(head2.next.data);
	}
}
