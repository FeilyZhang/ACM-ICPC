package tech.feily.acm_icpc.eval;

/*
 * Output all four digit symmetrical numbers, and the sum of each digit is required to be 10.
 */
public class SymmetryNumber {

    public static void display() {
        for (int i = 1000; i < 10000; i++) {
            int l = 0, h = 0, s = 0;
            int n = i, d = 1000;
            while (d != 0) {
                // extract low bit and high bit firstly.
                l = n % 10;
                h = n / d;
                // If high and low are not equal, break directly.
                if (l != h) break;
                // Otherwise, remove the high and low bit of the original integer to make the next comparison.
                s += l + h;
                d /= 100;
                // remove the low bit.
                n /= 10;
                // remove the high bit.
                n -= h * 100;
                if (d == 0 && s == 10) {
                    System.out.println(i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        display();
    }

}
