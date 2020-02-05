package tech.feily.acm_icpc.dp;

import java.util.Arrays;

public class Coin {

    public static void count(int n) {
        int[] f = new int[n + 1];
        int cost;
        f[0] = 0;
        for (int i = 1; i <= n; i++) {
            cost = Integer.MAX_VALUE;
            if (i - 1 >= 0) cost = cost > f[i - 1] + 1 ? f[i - 1] + 1 : cost;
            if (i - 5 >= 0) cost = cost > f[i - 5] + 1 ? f[i - 5] + 1 : cost;
            if (i - 11 >= 0) cost = cost > f[i - 11] + 1 ? f[i - 11] + 1 : cost;
            f[i] = cost;
            System.out.println("f[" + i + "]=" + f[i]);
        }
    }
    
    public static int count(int n, int[] coin) {
        int[] f = new int[n + 1];
        int cost;
        f[0] = 0;
        Arrays.sort(coin);
        for (int i = 1; i <= n; i++) {
            cost = Integer.MAX_VALUE;
            for (int j = 0; j < coin.length; j++) {
                if (i - coin[j] >= 0) {
                    cost = cost > f[i - coin[j]] + 1 ? f[i - coin[j]] + 1 : cost;
                }
            }
            f[i] = cost;
        }
        return f[n];
    }
    
    public static void main(String[] args) {
        count(15);
        System.out.println(count(15, new int[] {5, 1, 11}));
    }

}
