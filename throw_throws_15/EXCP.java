class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EXCP {                     //checked exception

    public static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}