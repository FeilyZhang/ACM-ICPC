package tech.feily.acm_icpc.recur;

/*
 * Ask for someone's age.
 * 
 * There are n people sitting around.
 * When asking for age of nth person, he said he was two years older than n-1th person.
 * When asking for age of n-1th person, he said he was two years older then n-2th person.
 * ...
 * When asking for the first person, He said he is 10 years old. 
 * What's the age of the nth person?
 */
public class Years {

    /*
     * By observing problem, 
     * we can find that the age of the nth person is based on the age of the first person plus (n-1)*2.
     */
    public static int getYears(int n) {
        return 10 + (n - 1) * 2;
    }
    
    public static void main(String[] args) {
        System.out.println(getYears(5));
    }

}
