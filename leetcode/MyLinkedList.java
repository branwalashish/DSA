/* I have shared this implemented this program from the problem name "Design Linked List"
*  And for detailed i have built my own custom linkedlist in this repo link : https://github.com/branwalashish/DSA/blob/main/linkedlistOperation/MyLinkedList.java
*/
class MyLinkedList {

    private class Node {
            int val;
            Node next;
            Node(int val){
                this.val = val;
                this.next = null;
            }
        }
    private Node head;
    private Node tail;
    private int size; 

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        
        if(index<0 || index >= size){
            return -1;
        }
        Node temp = head;
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode ;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if(head == null){
            head = tail = newNode;
        }else{         
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
       if(index < 0 || index > size) return;

       if(index == 0){
        addAtHead(val);
        return;
       }
       if(index == size){
        addAtTail(val);
        return;
       }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
       if (index < 0 || index >= size) return;

       if(index == 0){
        head = head.next;
        if(size == 1){
            tail = null;
        }
       }else{
        Node temp = head;
        for(int i = 0 ; i <index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(index == size-1){
            tail = temp;
        }
       }
    size--;
        if (size == 0) {
        head = null;
        tail = null;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
