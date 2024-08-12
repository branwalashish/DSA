package linkedlistOperation;


public class MyCircularLinkedList {
	class Node
	{
	int data;
	Node next;
	 
	Node(int data){
		this.data = data;
	}
}
	Node head;
	Node tail;
	int c;
	//it will add the element at last node
	public int add(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head =newNode;
			tail = newNode;
			newNode.next = head;
			c++;
		}else {
			tail.next = newNode;
			tail = newNode;		
			tail.next = head;
			c++;
		}
		return data;
	}
	//adding the node at first
	public int addFirst(int data) {
		  Node newNode = new Node(data);
		 
		  if (head == null) {
		    head = newNode;
		    tail = newNode;
		    newNode.next = head;
		    
		  } else {
		    Node temp = head;
		    newNode.next = temp;
		    head = newNode;
		    tail.next = head;
		  }
		  c++;
		  return data;
		}
	//it will remove the first node
	public int removeFirst() {
		if(head==null) {
			throw new NullPointerException("List is Empty");
		}
			int res = head.data;
			if(head!=tail) // for more than one elements
			{
				head = head.next;
				tail.next = head;
			}else {
				head=tail=null;
			}
			c--;
			return res;	
	}
	//it will remove the last element
	public int remove() {
		if(head==null) {
			throw new NullPointerException("List is Empty");
		}
		int res = tail.data;
		if(head!=tail) {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			tail = temp;
			tail.next = head;
		}else {
			head=tail=null;
		}
		c--;
		return res;
	}
	
//	public int remove(int index) {
//		if(index<0||index>size()) {
//			throw new IndexOutOfBoundsException("Index out of bound for this index"+index);
//		}
//		
//		if(head==null) {
//			throw new NullPointerException("Empty LinkedList");
//		}
//		Node temp = head;
//		Node prev = null;
//		
//	}
	
	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("List is Empty");
		}
		else {
			do {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}while(temp!=head);
		}
		System.out.println();
	}
	
	public int size() {
		return c;
	}
	
	
}
