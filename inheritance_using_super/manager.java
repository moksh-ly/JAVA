
class Employee {
    String name = "Moksh";
    int salary = 30000;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    String name = "Manager Moksh";
    int salary = 50000;

    void display() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Salary: " + salary);

        // Accessing parent class variables using super
        System.out.println("Employee Name: " + super.name);
        System.out.println("Employee Salary: " + super.salary);

        // Calling parent class method using super
        super.display();
    }
}

public class manager {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}