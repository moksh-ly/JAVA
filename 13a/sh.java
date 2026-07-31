```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PatientDetails {
    public static void main(String[] args) {

        try {
            // Store patient information in a file
            FileWriter writer = new FileWriter("patientinfo.txt");

            writer.write("====== PATIENT DETAILS ======\n");
            writer.write("Name: Rahul Mehta\n");
            writer.write("Patient ID: 20541\n");
            writer.write("Age: 42\n");
            writer.write("Diagnosis: Under Observation\n");

            writer.close();

            // Read information from the file
            FileReader reader = new FileReader("patientinfo.txt");
            StringBuilder patientData = new StringBuilder();

            int data;
            while ((data = reader.read()) != -1) {
                patientData.append((char) data);
            }

            System.out.println(patientData);

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
            System.out.println("Exception: "
                    + e.getClass().getSimpleName() + " occurred.");
        }
    }
}
