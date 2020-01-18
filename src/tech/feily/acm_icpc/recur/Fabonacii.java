package tech.feily.acm_icpc.recur;

/*
 * Fibonacci sequence, namely rabbit breeding problems.
 */
public class Fabonacii {

    public static int fab(int n) {
        int pre, cur;
        pre = cur = 1;
        if (n == 1 || n == 2) return pre;
        for (int i = 3; i <= n; i++) {
            cur = cur + pre;
            pre = cur - pre;
        }
        return cur;
    }
    
    public static int fab2(int n) {
        if (n == 1 || n == 2) return 1;
        return fab2(n - 1) + fab2(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.println(fab(1) == fab2(1));
        System.out.println(fab(2) == fab2(2));
        System.out.println(fab(5) == fab2(5));
        System.out.println(fab(8) == fab2(8));
    }

}
