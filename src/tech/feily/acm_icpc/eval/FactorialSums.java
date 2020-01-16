package tech.feily.acm_icpc.eval;

/*
 * Given an integer, calculate its factorial sums in its range.
 */
public class FactorialSums {

    public static int fac(int n) {
        int val = 1;
        for (int i = 1; i <= n; i++) {
            val *= i;
        }
        return val;
    }
    
    public static int sum(int n) {
        int val = 0;
        for (int i = 1; i <= n; i++) {
            val += fac(i);
        }
        return val;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(3));
    }

}
