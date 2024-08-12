package queueOperation;

public class MyCircularQueue {

	int array[]; 
	int front;
	int rear ;
	int size;
	public MyCircularQueue(int s) {
		array = new int[s];
		front = -1;
		rear = -1;
		size = s;
	}
	
	boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if((rear+1)%size == front) {
			return true;
		}
		return false;
	}
	
	public int capacity() {
		return array.length;
	}
	
	void enque(int data) {
//		if(isFull()) 
		if((rear+1)%array.length == front)
		{
			System.out.println("Queue is full");
			return ;
		}
		else if(isEmpty()) {
			front++;
			rear++;
			array[rear] = data;
		}else {
			if(!isFull()) {
				rear = (rear+1)%size;
				array[rear] = data;
			}
			size++;
		}
	}
	
	int deque() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
			int res = -1;
			if(front == rear) {
				res = array[front];
				array[front]=-1;
				front = -1;
				rear = -1;
			}else {
				res = array[front];
				array[front]=-1;
				front = (front+1)%size;
			}
			size--;
			return res;
		
		
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return array[front];
	}
}
