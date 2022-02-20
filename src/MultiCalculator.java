import mymethods.Calculations;
import mymethods.UserInput;

public class MultiCalculator {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        UserInput test = new UserInput();

        int intTest = test.getInt("help");
        System.out.println(intTest);

        double doubleTest = test.getDouble("help");
        System.out.println(doubleTest);
    }
}
