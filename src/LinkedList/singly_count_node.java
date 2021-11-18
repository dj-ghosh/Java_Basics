package LinkedList;

public class singly_count_node {
	static class Node{
		int data;
		Node next;
		
		Node (int data){
			this.data = data;
			next = null;
		}
	}

	public void display(Node head) {
		int count = 0;
		Node cur = head;
		while(cur!=null) {
			count++;
			cur = cur.next;
		}
		System.out.println("THe no of nodes is/are "+count);
	}
	public static void main(String[] args) {
		singly_count_node s1 = new singly_count_node();
		Node n1 = new Node(50);
		Node n2 = new Node(60);
		Node n3 = new Node(70);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		
		s1.display(head);
		
	}

}
