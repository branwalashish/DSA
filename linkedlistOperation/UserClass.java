package linkedlistOperation;
public class UserClass {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        //checking the size method
        System.out.println(ll.size());
        
        ll.add(15);
        ll.add(20);
        // checking that after filling nodes size is increases or not..
        System.out.println(ll.size());

        
    }
    
}
