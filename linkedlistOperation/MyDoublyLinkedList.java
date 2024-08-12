package linkedlistOperation;
/*
 * Using i am creating the implementation class of Doubly LinkedList where every node store the address of previous node and after 
 * node also that's why it is bi-directional 
 * only last node next address should point to null
 */

public class MyDoublyLinkedList {
	
class Node{
	int data;
	Node prev;
	Node next;
	
	Node(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}
	Node head;
	Node tail;
	int size;

	public boolean isEmpty() {
		return head==null;
		
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) 
		{
			head = tail = newNode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
			temp = temp.next;	
			
			}
			temp.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		size++;
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
		}else {
			newNode.next=head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
		
	}
	
	//insertion at specific node
	public void add(int data, int idx) {
		Node newNode = new Node(data);
		if(idx<0||idx>size) {
			throw new IndexOutOfBoundsException("Index is not valid "+idx+"for this size: "+size);
		}
		if(idx==0) {
			newNode.next = head;
			if(head!=null) {
				head.prev = newNode;
			}
			head = newNode;
			if(tail==null) {
				tail = newNode;
			}
		}
	}
		

//	for specific index
//	public int remove(int index)
//	{
//		if(index<0||index>size) {
//			throw new IndexOutOfBoundsException("index out of bound" + index + "for the length: " + size);
//		}
//		
//	}
	
//	public int removeFirst() {
//		if(head==null) {
//			throw new NullPointerException("Empty LinkedList ");
//		}
//		int res = head.data;
//		else if()
//	}
	
	//remove at last
//	public int remove() {
//		int res;
//		if(head==null) {
//			throw new RuntimeException("LinkedList is Empty");
//		}
//		else if(head.next) {
//			Node temp = head;
//		}
//	}
	
	public void display() {
		if(head==null){
			System.out.println("No Element Found");
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	public void displayReverse() {
		Node temp = tail;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			temp = temp.prev;
		}
		System.out.println();
	}
}
