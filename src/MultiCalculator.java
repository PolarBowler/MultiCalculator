import mymethods.Calculations;
import mymethods.UserInput;

public class MultiCalculator {
    public static void main(String[] args) throws Exception {
        Calculations calculate = new Calculations();
        UserInput userInput = new UserInput();
        Boolean error = false;

        /*
         * Additional calculation modes need to be added to this array as well as on the
         * do - while loop a bit further down.
         */
        String[] calcModes = { "1 - Addition", "2 - Subtraction", "3 - Multiplication", "4 - Division",
                "5 - Exponentiation" };
        System.out.println("What kind of calculation do you want to do?");
        for (String i : calcModes)
            System.out.println(i);
        int modeSelect = 0;

        /*
         * The following loop runs while modeSelect is on the default 0.
         * Every additional calculation mode needs to be added to as an additional case!
         * The case needs to use the same number as added in the String array calcModes!
         */
        do {
            modeSelect = userInput.getInt("Enter the number of the calculation mode you wish to use: ");

            switch (modeSelect) {
                case 1:
                    System.out.println("Let's add two numbers together!");

                    double term1 = userInput.getDouble("Enter the first number: ");
                    double term2 = userInput.getDouble("Enter the second number: ");

                    double sum = calculate.addNums(term1, term2);
                    System.out.println("(" + term1 + ")+(" + term2 + ")=(" + sum + ")");
                    break;
                case 2:
                    System.out.println("Let's subtracte a number from a different number!");

                    double minuend = userInput.getDouble("Enter the number you want to subtract from: ");
                    double subtrahend = userInput.getDouble("Enter the number you want to subtract: ");

                    double difference = calculate.subtractNums(minuend, subtrahend);
                    System.out.println("(" + minuend + ")-(" + subtrahend + ")=(" + difference + ")");
                    break;
                case 3:
                    System.out.println("Let's multiply two numbers!");

                    double factor1 = userInput.getDouble("Enter the first factor: ");
                    double factor2 = userInput.getDouble("Enter the second factor: ");

                    double product = calculate.multiplyNums(factor1, factor2);
                    System.out.println("(" + factor1 + ")*(" + factor2 + ")=(" + product + ")");
                    break;
                case 4:
                    System.out.println("Let's divide a number with a different number!");

                    double dividend = userInput.getDouble("Enter the number you want to divide: ");
                    double divisor = 0.0d;

                    do {
                        divisor = userInput.getDouble("Enter the number to divide with: ");
                        if (divisor != 0) {
                            error = false;
                        } else {
                            System.out.println("Don't divide by 0! Try again!");
                            error = true;
                        }
                    } while (error);

                    double quotient = calculate.divideNums(dividend, divisor);
                    System.out.println("(" + dividend + ")/(" + divisor + ")=(" + quotient + ")");

                    break;
                case 5:
                    System.out.println("Let's raise a number to the power of an exponent!");

                    double base = userInput.getDouble("Enter the base: ");
                    int exponent = userInput.getInt("Enter the exponent: ");

                    double power = calculate.intExpoNums(base, exponent);
                    System.out.println("(" + base + ")^(" + exponent + ")=(" + power + ")");
                    break;
                default:
                    System.out.println("Sorry there are only " + calcModes.length
                            + " modes implemented so far! Please try again!");
                    modeSelect = 0;
                    break;
            }
        } while (modeSelect == 0);
    }
}