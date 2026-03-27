import java.util.Scanner;

public class GradeEvaluator {

    public static void run(Scanner input) {
        double grade = InputValidator.getDouble(input, "Enter your percentage: ");

        if ((grade <= 100)&(grade >= 90))
            System.out.println("Excellent");
        else if ((grade <=89.9)&(grade >= 80))
            System.out.println("Very Good");
        else if ((grade <= 79.9)&(grade >= 70))
            System.out.println("Good");
        else if ((grade <= 69.9)&(grade >= 60))
            System.out.println("Pass");
        else if ((grade <= 59.9)&(grade >= 0))
            System.out.println("Fail");
    }
}