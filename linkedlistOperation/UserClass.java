package linkedlistOperation;

public class UserClass {

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList();
		
//		ll.add(15);
//		ll.add(20);
//		ll.add(25);
//		ll.add(35);
//		ll.add(65);
//		ll.display();
//		ll.remove();
//		ll.display();
//		ll.reverseLL();
//		ll.display();
//		ll.remove(1);
//		ll.display();
		
//		MyCircularLinkedList cl = new MyCircularLinkedList();
//		cl.add(15);
//		cl.add(25);
//		cl.display();
//		System.out.println(cl.size());
		
		
//		MyDoublyLinkedList dll = new MyDoublyLinkedList();
//		dll.add(50);
//		dll.add(15);
		
//		dll.display();
		
		ll.add(15);
		ll.add(5);
		ll.add(25);
		ll.add(95);
		ll.add(65);
		ll.add(35);
		System.out.println("Without sorting");
		ll.display();
		
		
		ll.bubbleSort();
		System.out.println("After applying bubble sorting");
		ll.display();
	}

}
