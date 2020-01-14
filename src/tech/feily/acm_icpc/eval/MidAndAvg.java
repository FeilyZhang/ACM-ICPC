package tech.feily.acm_icpc.eval;

import java.util.Arrays;

/*
 * Given an integer array, calculate its median and average.
 * The result of Method mid and avg is a floating-point number, or the integer will lose precision.
 */
public class MidAndAvg {

    public static double mid(int[] ar, int len) {
        return len % 2 != 0 ? ar[len / 2] : (ar[len / 2] + ar[len / 2 - 1]) / 2.0;
    }
    
    public static double avg(int[] ar, int len) {
        return sum(ar, len - 1) / 2.0;
    }
    
    /*
     * Sum an integer array recursively.
     */
    public static int sum(int[] ar, int i) {
        if (i == 0) return ar[0];
        int acu = sum(ar, i - 1);
        return acu + ar[i];
    }
    
    public static void main(String[] args) {
        int[] ar = {9, 1, 8, 4, 10, 5, 6, 7};
        Arrays.sort(ar);
        System.out.println("mid: " + mid(ar, ar.length));
        System.out.println("avg: " + avg(ar, ar.length));

    }

}
