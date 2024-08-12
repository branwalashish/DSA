package linkedlistOperation;

import java.util.Stack;

public class MyLinkedList {
	Node head;
	private int c = 0;

	public int size() {
		return c;
	}

	// this method will add the node at end
	public int add(int n) {
		Node newNode = new Node(n);

		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		c++;
		return n;
	}
	//Add a node at the front of the list
	public void addfront(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		c++;
	}
	// Add a node at a specific index
	public int add(int index, int data) {

		if (index < 0 || index > c)// work for index below zero and index > size allows adding at the end
		{
			throw new IndexOutOfBoundsException("invalid index: " + index);
		}
		Node newNode = new Node(data);
		if (index == 0)// add element in non empty list as first element
		{
			addfront(data); // Handles adding to an empty list or at the beginning
		}
		else// handling all valid index(0-size)
		{
			Node temp = head;
			// Traverse to the node just before the index where the new node will be
			// inserted
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		c++;
		return data;

	}

	public int removeFirst() {
		if (head == null) {
			throw new NullPointerException("Empty LinkedList");
		}
		int res = head.data;
		head = head.next;
		c--;
		return res;
	}

	public int remove() {
		int res;
		if (head == null) {
			throw new NullPointerException("Empty LinkedList");
		} else if (head.next == null) {
			res = head.data;
			head = null;
			c--;
			return res;

		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		res = temp.next.data;
		temp.next = null;
		c--;
		return res;
	}

	public int remove(int index) {
		if (index < 0 || index >= c)// work for index below zero
		{
			throw new IndexOutOfBoundsException("index out of bound" + index + "for the length: " + size());
		}
		if (index == 0) {
			return removeFirst();
		}

		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
		}
		int res = temp.next.data;
		temp.next = temp.next.next;
		c--; // decrementing the size
		return res;
	}

	public int findLast() {
		if (head == null) {
			throw new NullPointerException("LinkedList is empty");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

//for displaying the complete linkedlist until the pointing node will null
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	// for searching the value in the linkedlist and it show the index
	public int get(int key) {
		Node temp = head;
		int index = 0;
		while (temp != null) {
			if (temp.data == key) {
				return index;
			}
			temp = temp.next;
			index++;
		}
		return -1;
	}
	// this method is reversing the linkedlist using recursion
//	public Node reverse(Node head) {
//		if(head == null || head.next ==null) {
//			return head;
//		}
//		Node newHead = reverse(head.next);
//		Node front = head.next;
//		front.next = head;
//		head.next = null;
//		return newHead;
//	}

	public Node reverseLL() {

		Node prev = null;
		Node temp = head;

		while (temp != null) {
			Node second = temp.next;
			temp.next = prev;
			prev = temp;
			temp = second;
		}
		head = prev;
		return head;
	}

	// using Stack
	public Node reverseUsingStack(Node head) {
		Stack<Integer> s = new Stack<Integer>();
		Node temp = head;
		while (temp != null) {
			s.push(temp.data);
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			temp.data = s.pop();
			temp = temp.next;
		}
		return head;
	}

	public void bubbleSort() {
		if (head == null) {
			return;
		}

		int count = 0;
		Node start = head;
		while (start != null) {
			count++;
			start = start.next;
		}
		for (int i = 0; i < c - 1; i++) {
            Node curr = head;
            while (curr != null && curr.next != null) {
                if (curr.data > curr.next.data) {
                    swapNodes(curr.data, curr.next.data);
                }
                curr = curr.next;
            }
        }
		for (int i = 0; i < count; i++) {

			Node curr = head;
			while (curr != null && curr.next != null) {

				if (curr.data > curr.next.data) {
					swapNodes(curr.data, curr.next.data);
				}
				curr = curr.next;
			}
		}
	}

	public void swapNodes(int x, int y) {

		if (x == y) {
			return;
		}

		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		if (currX == null || currY == null) {
			return;
		}

		if (prevX != null) {
			prevX.next = currY;
		} else {

			head = currY;
		}

		if (prevY != null) {
			prevY.next = currX;
		} else {

			head = currX;
		}

		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

}

//concurrent Hashmap
//hashmap is not thread safe

//	not working for index 0
//	not working for index above size
//	working fine fir index below zero
//	working for valid index
//	

//solve questions on gfg

//bracket balancing

//floyedd https://www.geeksforgeeks.org/floyds-cycle-finding-algorithm/