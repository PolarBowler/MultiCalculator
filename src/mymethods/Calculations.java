package mymethods;

public class Calculations {
    public double addNums(double term1, double term2) {
        double sum = term1 + term2;
        return sum;
    }
    public double subtractNums(double minuend, double subtrahend) {
        double difference = minuend - subtrahend;
        return difference;
    }
    public double multiplyNums(double factor1, double factor2) {
        double product = factor1 * factor2;
        return product;
    }
    public double divideNums(double dividend, double divisor) {
        double quotient = dividend / divisor;
        return quotient;
    }
    public double intExpoNums(double base, int exponent) {
        double power = base;
        for (int i = 1; i < exponent; i++) power *= base;
        return power;
    }
}
