import mymethods.Calculations;
import mymethods.UserInput;

public class MultiCalculator {
    public static void main(String[] args) throws Exception {
        UserInput test = new UserInput();

        byte byteTest = test.getByte("Input a number between -128 and 127 without decimal points: ");
        System.out.println("You entered: " + byteTest);

        short shortTest = test.getShort("Input a number between -32,768 and 32,767 without decimal points: ");
        System.out.println("You entered: " + shortTest);

        int intTest = test.getInt("Input a number between -2,147,483,648 and 2,147,483,647 without decimal points: ");
        System.out.println("You entered: " + intTest);

        long longTest = test.getLong("Input a number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807 without decimal points: ");
        System.out.println("You entered: " + longTest);

        float floatTest = test.getFloat("Input a number with up to 6 decimal points: ");
        System.out.println("You entered: " + floatTest);

        double doubleTest = test.getDouble("Input a number with up to 15 decimal points: ");
        System.out.println("You entered: " + doubleTest);

        String stringTest = test.getString("Input a string: ");
        System.out.println("You entered: " + stringTest);

        String stringTest2 = test.getString("Input a string(do not leave empty): ", false);
        System.out.println("You entered: " + stringTest2);
    }
}
