import java.util.Scanner;

public class Calculator {

    public static void run(Scanner input) {
        double a = InputValidator.getDouble(input, "Enter first number: ");
        double b = InputValidator.getDouble(input, "Enter second number: ");

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int op = InputValidator.getInt(input, "Choose operation: ");

        switch (op) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot divide by zero!");
                break;
        }
    }
}