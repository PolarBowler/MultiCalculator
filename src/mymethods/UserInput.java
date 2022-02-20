package mymethods;
import java.util.Scanner;

public class UserInput {
    private Scanner sc = new Scanner(System.in);
    private Boolean error = false;
    private String invalidInput = "Invalid input, please try again!";

    public int getInt(String prompt) {
        int result = 0;

        System.out.println(prompt);

        do {
            error = false;
            try {
                result = sc.nextInt();
            } catch (Exception e) {
                System.out.println(invalidInput);
                sc.next();
                error = true;
            }
        } while (error);

        return result;
    }

    public double getDouble(String prompt) {
        double result = 0;

        System.out.println(prompt);

        do {
            error = false;
            try {
                result = sc.nextDouble();
            } catch (Exception e) {
                System.out.println(invalidInput);
                sc.next();
                error = true;
            }
        } while (error);

        return result;
    }
}
