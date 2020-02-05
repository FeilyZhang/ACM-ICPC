package tech.feily.acm_icpc.recur;

/*
 * @author Feily zhang
 */
public class Output {

    public static void output(int num) {
        if (num < 10) System.out.print(num + " ");
        else {
            output(num / 10);
            System.out.print(num % 10 + " ");
        }
    }

    public static String output1(int num) {
        if (num < 10) return num + " ";
        String s = output1(num / 10);
        return s + num % 10 + " ";
    }
    
    public static void main(String[] args) {
        output(13579);
        System.out.println("\n" + output1(13579));
    }

}
