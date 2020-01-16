package tech.feily.acm_icpc.eval;

/*
 * Given any three integers, the area of triangle is calculated by Heron's formula.
 * 
 */
public class TriangleArea {

    /*
     * First of all, we need to judge whether it is a triangle.
     */
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c ? true : false;
    }
    
    public static void calArea(double a, double b, double c) {
        if (isTriangle(a, b, c)) {
            double p = (a + b + c) / 2.0;
            System.out.println( Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        } else {
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        calArea(3.67, 5.43, 6.21);
    }

}
