package tech.feily.acm_icpc.eval;

/*
 * Given an odd number, calculate the approximate value of pi by general formula.
 */
public class Pi {

    /*
     * The general formula of PI approximation is as below.
     * pi / 2 = [(2 * 2) / (1 * 3)] * [(4 * 4) / (3 * 5)] * ，，，， * [(n + 1) * (n + 1) / (n * (n + 2))]
     * 
     */
    public static double calPi(int odd) {
        double pi_two = 1.0;
        for (int i = 1; i <= odd; i += 2) {
            pi_two *= ((i + 1) * (i + 1) * 1.0) / (i * (i + 2));
        }
        return pi_two * 2.0;
    }
    
    public static void main(String[] args) {
        System.out.println(new String(String.valueOf(calPi(151))).substring(0, 8));
    }

}
