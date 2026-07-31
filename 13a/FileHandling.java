
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        try {
           
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Welcome to Java Programming\n");
            writer.write("This program demonstrates file writing and reading.");
            writer.close();

            
            FileReader reader = new FileReader("data.txt");
            int data;
            StringBuilder content = new StringBuilder();

            while ((data = reader.read()) != -1) {
                content.append((char) data);
            }

            System.out.println("File Content:");
            System.out.println(content);

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            System.out.println("Exception Type: "
                    + e.getClass().getSimpleName());
        }
    }
}

