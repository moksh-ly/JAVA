import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input marks as String
        System.out.print("Enter marks of Subject 1: ");
        String mark1 = sc.nextLine();

        System.out.print("Enter marks of Subject 2: ");
        String mark2 = sc.nextLine();

        System.out.print("Enter marks of Subject 3: ");
        String mark3 = sc.nextLine();

        // Convert String to Integer (Wrapper Class)
        Integer m1 = Integer.valueOf(mark1);
        Integer m2 = Integer.valueOf(mark2);
        Integer m3 = Integer.valueOf(mark3);

        // Calculate total
        int total = m1 + m2 + m3;

        System.out.println("Total Marks = " + total);

        sc.close();
    }
}