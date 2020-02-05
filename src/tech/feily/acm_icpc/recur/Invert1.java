package tech.feily.acm_icpc.recur;

import java.util.Arrays;

/*
 * @author Feily Zhang
 */
public class Invert1 {

    public static void invert(int[] arr, int l, int r) {
        if (l < r) {
            invert(arr, l + 1, r - 1);
            arr[l] = arr[l] + arr[r];
            arr[r] = arr[l] - arr[r];
            arr[l] = arr[l] - arr[r];
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9, 7, 1, 5, 4};
        System.out.println(Arrays.toString(arr));
        invert(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    
}
