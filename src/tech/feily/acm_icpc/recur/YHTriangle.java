package tech.feily.acm_icpc.recur;

/*
 * Given a parameter n, calculate the corresponding Yanghui triangle.
 */
public class YHTriangle {

    public static int[][] yhTriangle(int n) {
        int[][] yh = new int[n][n];
        for (int i = 0; i < n; i++) {
            yh[i][0] = yh[i][i] = 1;
            for (int j = 1; j < i; j++) {
                yh[i][j] = yh[i - 1][j - 1] + yh[i - 1][j];
            }
        }
        return yh;
    }
    
    public static void main(String[] args) {
        int[][] yh = yhTriangle(5);
        for (int i = 0; i < yh.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(yh[i][j] + " ");
            }
            System.out.println();
        }
    }

}
