
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetails {
    public static void main(String[] args) {

        try {
            
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("EMPLOYEE INFORMATION\n");
            writer.write("Name:Moksh nagori\n");
            writer.write("Age: 28\n");
            writer.write("Department: Software Development\n");

            writer.close();

            // Reading employee details from the file
            FileReader reader = new FileReader("employee.txt");
            StringBuilder details = new StringBuilder();

            int data;
            while ((data = reader.read()) != -1) {
                details.append((char) data);
            }

            System.out.println(details);

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            System.out.println("Exception Type: " +
                    e.getClass().getSimpleName());
        }
    }
}

