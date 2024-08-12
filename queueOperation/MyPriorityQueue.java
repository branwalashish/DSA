package queueOperation;

public class MyPriorityQueue {

	private int array[];
	 private int front, rear, size;

	public MyPriorityQueue(int s) {
		front = -1;
		rear = -1;
		array = new int[s];
		this.size = s;
	}

	public boolean isFull() {
		return rear == (size - 1);
	}

	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	public void enque(int data) {
		if (isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		if(isEmpty()) {
			front++;
			rear++;
			array[rear] = data;
		} else {
			int i;
			for (i = rear; i >= 0; i--) {
				if (array[i] < data) {
					array[i + 1] = array[i];

				} else {
					break;
				}
				i++;
				array[i] = data;
				rear++;
			}

		}
	}

	public void deque() {
		if (!isEmpty()) {
			System.out.println("Deleted element : " + array[front]);
			front++;
		}
		if(front>rear) {
			front = rear = -1;
		}
		else {
			System.out.println("Queue is Empty ");
		}
	}

	public int peek() {

		if (!isEmpty())
			return array[front];

		throw new IllegalStateException("Queue is Empty");
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty ");
			return;
		}
		for(int i = front ; i<= rear ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
