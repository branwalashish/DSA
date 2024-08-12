package queueOperation;

public class UserClass {

	public static void main(String[] args) {
		
//		MyQueue q = new MyQueue(5);
//		
//		q.enQueue(20);
//		q.enQueue(20);
//		q.enQueue(20);
//		q.enQueue(20);
//		q.enQueue(20);
//		System.out.println(q.isEmpty());
//		System.out.println(q.isFull());
//		q.deQueue(); 
		
//		MyCircularQueue cq = new MyCircularQueue(5);
//		
//		System.out.println(cq.isEmpty());
//		cq.enque(5);
//		cq.enque(20);
//		cq.enque(50);
//		cq.enque(60);
//		cq.enque(80);
//		System.out.println("peek"+cq.peek());
//		System.out.println(cq.isEmpty());
//		System.out.println(cq.isFull());

		MyPriorityQueue pq = new MyPriorityQueue(5);
		pq.enque(15);
		pq.enque(20);
		pq.enque(60);
		pq.enque(10);
		
		pq.display();
		
	}

}
