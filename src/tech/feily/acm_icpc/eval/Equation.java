package tech.feily.acm_icpc.eval;

/*
 * The real roots of solving quadratic equation of one variable.
 */
public class Equation {

    public static void solve(int a, int b, int c) {
        int delta = b * b - 4 * a * c;
        if (delta < 0) System.out.println("unsolvable"); 
        else if (delta == 0) System.out.println("x1 = x2 = " + (b * -1) / (2.0 * a));
        else {
            double x1 = (b * -1 + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (b * -1 - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
    
    public static void main(String[] args) {
        solve(4, -6, 0);
    }

}
