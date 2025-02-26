import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Creating BufferedReader object
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Taking user input
            System.out.print("Enter your name: ");
            String name = br.readLine(); // Reads a full line as a String

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine()); // Reads as String and converts to int

            System.out.print("Enter your marks: ");
            double marks = Double.parseDouble(br.readLine()); // Reads as String and converts to double

            // Displaying the input
            System.out.println("\nYour Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Marks: " + marks);

            // Closing the BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
