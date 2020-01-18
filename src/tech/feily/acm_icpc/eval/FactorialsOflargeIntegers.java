package tech.feily.acm_icpc.eval;

/*
 * Factorials of large integers.
 * For the input positive integer n, calculate the exact value of n!.
 */
public class FactorialsOflargeIntegers {

    public static void fac(int n) {
        // Field s is the carry of each multiplication.
        // Field l is the end position of result array.
        int s, l = 0;
        int[] a = new int[1000];
        // Because it's multiplication, the initial value of array is 1.
        a[0] = 1;
        for (int i = 1; i <= n; i++) {
            s = 0;
            // Multiply bit by bit, then get the final carry.
            for (int j = 0; j <= l; j++) {
                s = s + a[j] * i;
                a[j] = s % 10;
                s = s / 10;
            }
            // Process the final carry of each multiplication.
            while (s != 0) {
                l++;
                a[l] = s % 10;
                s = s / 10;
            }
        }
        for (int i = l; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
    
    public static void main(String[] args) {
        fac(9);
        System.out.println();
        fac(100);
    }

}
