class Student {

    String studentName;
    int studentRoll;

    // Default Constructor
    Student() {
        this.studentName = "Not Assigned";
        this.studentRoll = -1;
    }

    // Parameterized Constructor
    Student(String studentName, int studentRoll) {
        this.studentName = studentName;
        this.studentRoll = studentRoll;
    }

    // Method to print student details
    void showDetails() {
        System.out.println("Name      : " + studentName);
        System.out.println("Roll No.  : " + studentRoll);
        System.out.println("----------------------");
    }
}

public class StudentInfo {
    public static void main(String[] args) {

        Student firstStudent = new Student();

        Student secondStudent = new Student("Aman", 201);

        System.out.println("Student Created Using Default Constructor");
        firstStudent.showDetails();

        System.out.println("Student Created Using Parameterized Constructor");
        secondStudent.showDetails();
    }
}