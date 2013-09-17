public class Node{

    Node next = null;
    int data;

    public Node(int d){
	data = d;
    }

    public static void main(String[] args){

	System.out.println("Hi");

	Node n = new Node(1);
	Node end = new Node(2);

	n.next = end;
	
	
    }

}