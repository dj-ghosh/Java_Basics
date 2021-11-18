package LinkedList;

public class singly_List {
	
	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}

	public void display(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data+"\t");
			cur = cur.next;
		}
	}
	public static void main(String[] args) {
		singly_List sl = new singly_List();
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		
		sl.display(head);
	}

}
