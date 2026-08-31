class InvalidAgeException extends Throwable {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EXCP{
    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to vote.");
        }
    }


    public static void main(String[] args) {
        try {
           validate(19);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
