import java.util.ArrayList;
import java.util.Scanner;

public class tt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("\nTASK MANAGER ");
            System.out.println("1. Add New Task");
            System.out.println("2. Show All Tasks");
            System.out.println("3. Delete a Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task name: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task added successfully.");

            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("Your task list is empty.");
                } else {
                    StringBuffer sb = new StringBuffer();
                    sb.append("\n MY TASKS\n");

                    for (int i = 0; i < tasks.size(); i++) {
                        sb.append((i + 1) + ". " + tasks.get(i) + "\n");
                    }

                    System.out.println(sb);
                }

            } else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available to delete.");
                } else {
                    System.out.print("Enter the task number to delete: ");
                    int n = sc.nextInt();

                    if (n >= 1 && n <= tasks.size()) {
                        tasks.remove(n - 1);
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Thank you for using Task Manager!");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}