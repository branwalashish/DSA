import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Reads full line

        System.out.println("Enter your age:");
        int age = sc.nextInt(); // Reads an integer

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        sc.close(); // Always close Scanner to avoid memory leaks

        


    }
}
