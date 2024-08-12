package stackOperation;

import java.util.EmptyStackException;

public class MyStack {

	private int top;
	private int[] array;
	
	public MyStack(int capc) {
		if(capc<=0) {
			throw new IllegalArgumentException("Stack's Capacity must be positive");
		}
		array = new int[capc];
		top = -1;
	}
	
	public void push(int data) {
		if(top == array.length-1) {
			throw new StackOverflowError("Stack is Full");
		}
		top++;
		array[top] = data;
	}
	
	public int peek() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		return array[top];
	}
	
	public void pop() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		System.out.println(array[top]);
		top--;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == array.length-1;
	}
	
	public String toString() {
		if(top==-1) {
			return "[]";
		}
		String res="[";
		for(int i = 0 ; i <= top; i++) {
			res = res+array[i]+", ";
		}
		return res.substring(0,res.length()-2)+"]";
	}
	public int size() {
		return top+1;
	}
	
	public int capacity() {
		return array.length;
	}
	
}
