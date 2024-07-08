public class UserClass{
   
    public static void main(String[] args) throws IllegalAccessException
    {
       MyArray myArray = new MyArray();

        myArray.add(50);
        myArray.add(5);
        myArray.add(5);
        myArray.add(5);
        myArray.display();
        
        System.out.println(myArray.size());
        // Testing toString method
        System.out.println(myArray);
        
        // Removing the first element
        myArray.removeFirst();
        myArray.display();
        
        System.out.println(myArray); 
        
    }
}