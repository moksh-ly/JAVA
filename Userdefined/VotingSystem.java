
package Userdefined;

import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

class VotingSystem {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("You are not eligible for voting.");
        }

        System.out.println("You are eligible for voting.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}