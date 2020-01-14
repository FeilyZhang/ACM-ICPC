package tech.feily.acm_icpc.eval;

/*
 * Given a year, determine whether it is a leap year.
 */
public class IsLeapYear {

    public static boolean isLeapYear(int y) {
        return y % 4 == 0 ? y % 100 !=0 ? true : y % 400 == 0 ? true : false : false; 
    }
    
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2013));
        System.out.println(isLeapYear(2020));
    }

}
