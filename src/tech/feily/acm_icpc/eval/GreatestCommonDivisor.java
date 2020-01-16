package tech.feily.acm_icpc.eval;

/*
 * Given any two integers, the greatest common divisor is calculated by Euclid algorithm.
 */
public class GreatestCommonDivisor {

    public static int cal(int dividend, int divisor) {
        // exchanging dividend and divisor.
        if (divisor > dividend) {
            dividend = dividend + divisor;
            divisor = dividend - divisor;
            dividend = dividend - divisor;
        }
        // calculate the greatest common divisor.
        int remainder = 0;
        while (divisor != 0) {
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }
    
    public static void main(String[] args) {
        System.out.println(cal(123456, 7890));
        System.out.println(cal(7890, 123456));
    }

}
