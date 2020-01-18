package tech.feily.acm_icpc.eval;

/*
 * Given two large integers, calculate their product.
 */
public class MultiplicationOfLargeInteger {

    public static void multi(int[] a, int[] b) {
        int s, l = 0;
        int[] c = new int[10000];
        c[0] = 0;
        for (int i = 0; i < b.length; i++) {
            s = 0;
            l = i;
            for (int j = 0; j < a.length; j++) {
                s = s + a[j] * b[i] + c[l];
                c[l++] = s % 10;
                s = s / 10;
            }
            while (s != 0) {
                c[l++] += s % 10;
                s = s / 10;
            }
        }
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] a = {8, 4, 5, 9, 2, 1, 1};
        int[] b = {8, 6, 5, 2, 3, 9, 1, 1};
        multi(a, b);
    }

}
