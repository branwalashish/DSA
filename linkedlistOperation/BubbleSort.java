package linkedlistOperation;

public class BubbleSort {

	Node head;
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
