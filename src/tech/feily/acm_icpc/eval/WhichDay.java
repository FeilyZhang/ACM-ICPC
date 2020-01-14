package tech.feily.acm_icpc.eval;

import java.util.Arrays;

/*
 * Give a date and decide which day of the year it is.
 */
public class WhichDay {

    public static int which( int y, int m, int d) {
        int days = 0;
        int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (m > 2) {
            if (!IsLeapYear.isLeapYear(y)) {
                days = MidAndAvg.sum(Arrays.copyOfRange(md, 0, m), m - 1);
            } else {
                days = MidAndAvg.sum(Arrays.copyOfRange(md, 0, m), m - 1) + 1;
            }
        }
        return days + d;
    }
    
    public static void main(String[] args) {
        System.out.println(which(2019, 5, 4));
    }

}
