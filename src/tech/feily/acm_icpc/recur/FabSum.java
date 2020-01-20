package tech.feily.acm_icpc.recur;

/*
 * The sum of Fabonacii sequence.
 */
public class FabSum {

    /*
     * Accumulate while getting a Fibonacci sequence.
     */
    public static int sum(int fab) {
        int sum = 0;
        for (int i = 1; i <= fab; i++) {
            sum += Fabonacii.fab(i);
        }
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

}
