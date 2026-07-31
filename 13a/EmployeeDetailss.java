
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetailss {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("======= EMPLOYEE INFORMATION =======\n");
            writer.write("Name: Moksh Nagori\n");
            writer.write("Age: 22\n");
            writer.write("Department: Software Development\n");

            writer.close();

            FileReader reader = new FileReader("employee.txt");
            int data;
            StringBuilder details = new StringBuilder();

            while ((data = reader.read()) != -1) {
                details.append((char) data);
            }

            System.out.println("Employee Details:");
            System.out.println(details);

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            System.out.println("Exception Type: "
                    + e.getClass().getSimpleName());
        }
    }
}

