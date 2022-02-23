package mymethods;

/*
 *this class is intended to supply calculation methods to the main program
 */
public class Calculations {
    public double addNums(double term1, double term2) {
        return term1 + term2;
    }

    public double subtractNums(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    public double multiplyNums(double factor1, double factor2) {
        return factor1 * factor2;
    }

    public double divideNums(double dividend, double divisor) {
        return dividend / divisor;
    }

    public double intExpoNums(double base, int exponent) {
        double power = base;
        for (int i = 1; i < exponent; i++) power *= base;
        return power;
    }
}
