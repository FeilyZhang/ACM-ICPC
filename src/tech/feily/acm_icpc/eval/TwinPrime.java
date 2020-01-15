package tech.feily.acm_icpc.eval;

/*
 * Given two numbers, calculate all the twin prime numbers between them¡£
 * 
 */
public class TwinPrime {

    public static void twinPrime(int m, int n) {
        int pre = 2;
        for (int i = m; i < n + 1; i++) {
            if (IsPrime.isPrime(i)) {
                if (i - pre == 2) {
                    System.out.println(pre + " " + i);
                }
                pre = i;
            }
        }
    }
    
    public static void main(String[] args) {
        twinPrime(2, 19);
    }

}
