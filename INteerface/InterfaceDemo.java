
public interface Displayable {
    void printDetails();
}

class CollegeStudent implements Displayable {
    public void printDetails() {
        System.out.println("student: Moksh");
        System.out.println("course: B.Tech CSE");
    }
}

class CompanyEmployee implements Displayable {
    public void printDetails() {
        System.out.println("employee: rahul");
        System.out.println("department: IT");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        CollegeStudent s = new CollegeStudent();
        CompanyEmployee e = new CompanyEmployee();

        s.printDetails();
        e.printDetails();
    }
} {
    
}
