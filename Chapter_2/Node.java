public class Node{

    Node next = null;
    int data;

    public Node(int d){
	data = d;
    }

    public static void main(String[] args){

	System.out.println("Hi");

	Node head = new Node(1);
	Node tail = new Node(2);

	head.next = tail;

	System.out.println(head.data);
	System.out.println(head.next.data);
	
    }

}