package tech.feily.acm_icpc.recur;

/*
 * @author Feily Zhang
 */
public class ArrMax {
    
    public static int max(int[] arr, int i) {
        if (i == 0) return arr[0];
        int pre = max(arr, i - 1);
        return pre > arr[i] ? pre : arr[i];
    }
    
    public static int sum(int[] arr, int i) {
        if (i == 0) return arr[0];
        return sum(arr, i - 1) + arr[i];
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9, 7, 1, 5, 4};
        System.out.println(max(arr, arr.length - 1));
        System.out.println(sum(arr, arr.length - 1));
    }

}
