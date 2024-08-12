package stackOperation;

public class UserClass {

	public static void main(String[] args) {

//		MyStack ms = new MyStack(5);
//		ms.push(15);
//		ms.push(25);
//		ms.push(35);
//		ms.push(65);
//		ms.push(95);
//		
//		ms.peek();
//		
//		ms.pop();

//		ms.peek();
		
		DynamicStack ds = new DynamicStack();
		
		System.out.println(ds.isEmpty());
		ds.push(2);
		ds.push(15);
		ds.push(62);
		System.out.println(ds);
		
//		
//		
		ds.displayReverse();
		System.out.println(ds.peek());
		
		
	}

}
