package linkedlistOperation;
public class UserClass {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        //checking the size method
        System.out.println(ll.size());
       
        ll.add(15);
        ll.add(20);
        ll.add(30);
        ll.add(40);
         ll.display();
        // checking that after filling nodes size is increases or not..
        System.out.println(ll.size());
        //checking remove method
        System.out.println("remove last node : "+ll.remove());
        System.out.println("remove last node : "+ll.remove());
        System.out.println("remove last node : "+ll.remove());
        System.out.println("remove last node : "+ll.remove());
        ll.display();


    }
    
}
