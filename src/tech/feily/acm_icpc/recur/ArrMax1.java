package tech.feily.acm_icpc.recur;

/*
 * @author Feily Zhang
 */
public class ArrMax1 {


    class Int {
        private int val;
        public void setVal(int val) {
            this.val = val;
        }
        public int getVal() {
            return val;
        }
    }
    
    public static void max(int[] arr, int i, Int j) {
        if (i != arr.length) {
            if (i == 0) {
                j.setVal(arr[0]);
                max(arr, i + 1, j);
            }
            if (arr[i] > j.getVal()) {
                j.setVal(arr[i]);
                max(arr, i + 1, j);
            } else max(arr, i + 1, j);
        }
    }
    
    public static void sum(int[] arr, int i, Int j) {
        if (i != arr.length) {
            if (i == 0) {
                j.setVal(arr[0]);
                sum(arr, i + 1, j);
            } else {
                j.setVal(arr[i] + j.getVal());
                sum(arr, i + 1, j);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 9, 7, 1, 5, 4};
        Int j = new ArrMax1().new Int();
        max(arr, 0, j);
        System.out.println(j.getVal());
        j.setVal(0);    // clear object j
        sum(arr, 0, j);
        System.out.println(j.getVal());
    }

}
