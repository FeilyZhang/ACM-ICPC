package tech.feily.acm_icpc.eval;

/*
 * Given an integer array, find the maximum value, no extra space.
 */
public class Maxinum {

    public static int max(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            ar[i + 1] = ar[i + 1] > ar[i] ? ar[i + 1] : ar[i];
        }
        return ar[ar.length - 1];
    }
    
    public static void main(String[] args) {
        int[] ar = {9, 1, 8, 4, 10, 5, 6, 7};
        System.out.println(max(ar));
    }

}
