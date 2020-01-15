package tech.feily.acm_icpc.eval;

/*
 * Given an integer, determine its total number of bits.
 */
public class BitNum {

    public static int bitNum(int n) {
        int i = 0;
        while (n > 9) {
            n /= 10;
            i += 1;
        }
        return i + 1;
    }
    
    public static int bitNumAno(int n) {
        if (n < 10) return 1;
        return 1 + bitNumAno(n / 10);
    }
    
    public static void eachDigit(int n) {
        while (n > 9) {
            System.out.print(n % 10 + " ");
            n /= 10;
        }
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        System.out.println(bitNum(198564));
        System.out.println(bitNumAno(198564));
        eachDigit(198564);
    }

}
