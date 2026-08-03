import java.util.ArrayList;
import java.util.Scanner;

public class studentCourse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("\n========== COURSE REGISTRATION ==========");
            System.out.println("1. Register a Course");
            System.out.println("2. Drop a Course");
            System.out.println("3. Show Registered Courses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter course name: ");
                String course = sc.nextLine();
                courses.add(course);
                System.out.println("Course registered successfully.");

            } else if (choice == 2) {

                if (courses.isEmpty()) {
                    System.out.println("No courses have been registered yet.");
                } else {
                    System.out.print("Enter course number to remove: ");
                    int num = sc.nextInt();

                    if (num >= 1 && num <= courses.size()) {
                        courses.remove(num - 1);
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Please enter a valid course number.");
                    }
                }

            } else if (choice == 3) {

                if (courses.isEmpty()) {
                    System.out.println("No registered courses found.");
                } else {
                    StringBuffer sb = new StringBuffer();
                    sb.append("\n------ REGISTERED COURSES ------\n");

                    for (int i = 0; i < courses.size(); i++) {
                        sb.append((i + 1) + ". " + courses.get(i) + "\n");
                    }

                    System.out.println(sb);
                }

            } else if (choice == 4) {
                System.out.println("Exiting Course Registration System...");

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}