package queueOperation;

public class MyQueue {

	int array[];
	int cap;
	 int size;
	int front=-1;
	int rear=-1;
	
	public MyQueue(int n){
		this.cap = n;
		this.array = new int[n];
		
		size = 0;
	}
	
	public boolean isEmpty() {
//		if(front== -1 && rear == -1) 
		if(front==rear)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(front ==0 && rear==array.length-1) {
			return true;
		}
		return false;
	}
	
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full"+cap);
			return;
		}
		else if(rear==-1 && front ==-1) {
			rear++;
			array[rear]=data;
		}
		else {
			rear++;
			array[rear] = data;
			
		}
		size++;
		System.out.println("item is added to the queue: "+data);
	}
	
	public int deQueue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is Empty");
		}
		
		int temp = array[front++]; //it will increment the front
									//and first store it in temp variable then delete the elemt
		if(front==cap) {
			front=0;
		}
		size--;
		return temp;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return array[front];
	}
}
