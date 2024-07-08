package linkedlistOperation;
public class MyLinkedList {
    
    Node head;
    private int c = 0;

    //size method to check the size of the LinkedList
    public int size(){
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            c++;
        }
        return c;
    }

    //to display the nodes of a LinkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // to move the cursor to next line on terminal
    }


    //add method to add the nodes..
    public int add(int n){
        Node newNode = new Node(n);
        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return n;
    }

    public void addFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
			head = newNode;
        }
    }

    //add at specific index
    public int add(int index, int data) {
		Node newNode = new Node(data);
		if (index < 0)// work for index below zero
		{
			throw new IndexOutOfBoundsException("invalid index ,index cannot be -ve value: " + index);
		} else if (head == null)// work for request of add without single element ex:-add(2,30)-->30
		{
			head = newNode;
		} else if (index == 0)// add element in non empty list as first element
		{
			newNode.next = head;
			head = newNode;
		} else// handling all valid index(0-size)
		{
			Node temp = head;
			int c = 0;
			while (c < index - 1) {
				c++;
				if (c == size()) {
					temp.next = newNode;
					return data;
				}
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return data;

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

  }



}
