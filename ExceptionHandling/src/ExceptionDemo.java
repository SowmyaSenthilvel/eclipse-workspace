import java.util.Scanner;

class AgeLimitException extends Exception {
    AgeLimitException(String exceptionResult) {
        super(exceptionResult);
    }
}

public class ExceptionDemo {
    static void checkAge(int age) throws AgeLimitException {
        if (age < 18) {
            throw new AgeLimitException("Min age is 18 to vote for your right..");
        } else {
            System.out.println("You're eligible to vote..");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();
        try {
            checkAge(userAge);
        } catch (Exception e) {
            System.out.println("Exception -- " + e.getMessage());
        }
    }
}