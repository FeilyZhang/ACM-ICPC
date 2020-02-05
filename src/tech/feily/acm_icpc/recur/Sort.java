package tech.feily.acm_icpc.recur;

import java.util.Arrays;

public class Sort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        //System.out.println(Arrays.toString(temp));
        for (int m = 0; m < temp.length; m++) {
            arr[m + low] = temp[m];
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void mergeSort(int[] arr, int a, int b) {
        if (a < b) {
            int mid = (a + b) / 2;
            System.out.println(a + " " + mid + " " + b);
            mergeSort(arr, a, mid);
            mergeSort(arr, mid + 1, b);
            merge(arr, a, mid, b);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9, 7, 1, 5, 4};
        mergeSort(arr, 0, arr.length - 1);
    }

}
