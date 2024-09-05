package linkedlistOperation;
/*
 * Singly Circular LinkedList ==> It is a type of linked list where the last node’s next pointer refers back to 
 * the first node, creating a circular connection. Unlike a regular Singly LinkedList, 
 * there is no null at the end.
 */
public class MyCircularLinkedList {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;
	Node tail;
	int c;

	// It will add the element at the last node
	public int add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; 
			c++;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head; 
			c++;
		}
		return data;
	}

	// Adding the node at first
	public int addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head; 
		} else {
			newNode.next = head;
			head = newNode;
			tail.next = head; 
		}
		c++;
		return data;
	}

	// It will remove the first node
	public int removeFirst() {
		if (head == null) {
			throw new NullPointerException("List is Empty");
		}
		int res = head.data;
		if (head != tail) { 
			head = head.next;
			tail.next = head; 
		} else {
			head = tail = null; 
		}
		c--;
		return res;
	}

	// It will remove the last element
	public int remove() {
		if (head == null) {
			throw new NullPointerException("List is Empty");
		}
		int res = tail.data;

		if (head != tail) { 
			Node temp = head;
			
			while (temp.next != tail) { 
				temp = temp.next;
			}
			tail = temp; 
			tail.next = head; 
		} else {
			head = tail = null; 
		}
		c--;
		return res;
	}

	// Remove element at specific index
	public int remove(int index) {
		if (index < 0 || index >= c) {
			throw new IndexOutOfBoundsException("Index out of bound: " + index);
		}

		if (index == 0) { 
			return removeFirst();
		}

		if (index == c - 1) { 
			return remove();
		}

		Node temp = head;
		for (int i = 0; i < index - 1; i++) { 
			temp = temp.next;
		}

		int res = temp.next.data;
		temp.next = temp.next.next;
		c--;

		return res;
	}

	// Display the elements in the list
	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			do {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			} while (temp != head); // Stop when we return to the head
		}
		System.out.println();
	}

	// Display elements in reverse (This is for illustrative purposes only, not a
	// typical operation on a singly linked list)
	public void displayReverse() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		Node temp = tail;
		Node prev = null;
		Node current = head;

		// Reverse traversal using next-to-last node finding
		for (int i = 0; i < c; i++) {
			while (current.next != temp && current.next != head) {
				current = current.next;
			}
			prev = current;
			System.out.print(temp.data + " <- ");
			temp = prev;
			current = head;
		}
		System.out.println();
	}

	// Returns the size of the list
	public int size() {
		return c;
	}

	// Get element at specific index
	public int get(int index) {
		if (index < 0 || index >= c) {
			throw new IndexOutOfBoundsException("Index out of bound: " + index);
		}

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		return temp.data;
	}
}
