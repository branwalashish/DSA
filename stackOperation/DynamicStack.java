package stackOperation;

import java.util.EmptyStackException;

class Node{
		int data;
		Node next;
		
	public Node(int data){
			this.data = data;
		}
	}
	

public class DynamicStack {

	Node top;
	public DynamicStack() {
		this.top=null;
	}
	
//	public void push(int data) {
//		Node newNode = new Node(data);
//		newNode.next = top;
//		top = newNode;
//	}
	
	public int push(int data) {
		Node newNode = new Node(data);
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
		return data;
	}
	
	public int pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		top = top.next;
		return top.data;
	}
	
	public int peek() {
		if(top == null) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	
	
	
//	public String toString() {
//		if(isEmpty()==true) {
//			return "[]";
//		}else {
//			
//		}
//	}

	//it is for printing the data and it is not mandatory 
	public void displayReverse() {
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	

	
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public String toString() {
		if(top==null) {
			return "[]";
		}
		String res="[";
		Node temp = top;
		while(temp != null) {
			res = res+temp.data+", ";
			temp = temp.next;
		}
		return res.substring(0,res.length()-2)+"]";
	}
	
	
}
//override a toString method for this