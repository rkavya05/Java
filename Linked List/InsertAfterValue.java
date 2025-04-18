import java.util.Scanner;
class Node{
    int data;
    Node next;
}
class Main{
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertAfterValue(Node head,int targetValue,int newValue){
        Node currentValue=head;
        while(currentValue!=null && currentValue.data!=targetValue){
            currentValue=currentValue.next;
        }
        if(currentValue==null){
            System.out.print("targetValue is not found");
        }
        Node newNode = new Node();
        newNode.data=newValue;
        newNode.next=currentValue.next;
        currentValue=newNode;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter element 1: ");
        Node head = new Node();
        head.data=sc.nextInt();
        Node temp = head;
        
        for(int i=2;i<=n;i++){
            System.out.print("Enter element " + i + ": ");
            Node newNode=new Node();
            newNode.data=sc.nextInt();
            temp.next=newNode;
            temp=newNode;
        }
        System.out.println("Original List:");
        printList(head);
        
        System.out.print("Enter targetValue : ");
        int targetValue=sc.nextInt();
        System.out.print("Enter newValue : ");
        int newValue=sc.nextInt();
        insertAfterValue(head,targetValue,newValue);
        
        System.out.println("Updated List:");
        printList(head);
    }
}
