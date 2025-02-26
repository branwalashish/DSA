import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderFileExample {
    public static void main(String[] args) {
        try {
            // Reading from a file
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            String line;
            while ((line = br.readLine()) != null) { // Reads line by line
                System.out.println(line);
            }

            // Closing BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
