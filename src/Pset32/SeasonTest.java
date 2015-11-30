package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/15
 */
public class SeasonTest {
    /**
     * This program evaluates an integer month and day value passed by several tests against the calling
     * 'season' method. Depending on the month and day criteria passed, as outlined in the class homework,
     * the season method returns the appropriate String response.
     */
    public static void main(String[] args) {
        System.out.println("System.out.println(season(2,1));");
        System.out.println(season(2,1));
        System.out.println("System.out.println(season(5,1));");
        System.out.println(season(5,1));
        System.out.println("System.out.println(season(8,1));");
        System.out.println(season(8,1));
        System.out.println("System.out.println(season(11,1));");
        System.out.println(season(11,1));
        System.out.println("System.out.println(season(5,31));");
        System.out.println(season(5,31));
        System.out.println("System.out.println(season(2,29));");
        System.out.println(season(2,29));
        System.out.println("System.out.println(season(8,31));");
        System.out.println(season(8,31));
        System.out.println("System.out.println(season(8,30));");
        System.out.println(season(8,30));
        System.out.println("System.out.println(season(9,10));");
        System.out.println(season(9,10));
        System.out.println("System.out.println(season(5,31));");
        System.out.println(season(5,31));
        System.out.println("System.out.println(season(11,31));");
        System.out.println(season(11,31));
        System.out.println("System.out.println(season(15,3));");
        System.out.println(season(15,3));
    }

    /**
     * @param month integer valued passed through main, legal values == 1 to 12
     * @param day   integer valued passed through main, legal values cary according to
     *              the Gregorian calendar
     * @return  Winter, Spring, Summer, or Fall, or impossible if an illegal value is passed.
     */
    public static String season(int month, int day){

        if (month > 12 || day > 32){
            return "impossible";
        }else {

            if (month == 1 && day > 30 || month == 3 && day > 30 || month == 5 && day > 30 ||
            month == 7 && day > 30 || month == 8 && day > 30 || month == 2 && day > 28){
                return "impossible";
            }else {

                if (month >= 12 && day >= 16 || month <= 3 && day <=15){
                    return "winter";
                }else if (month >= 3 && day >= 16 || month <= 6 && day <=15){
                    return "spring";
                }else if (month >= 6 && day >= 16 || month <= 9 && day <=15){
                    return "summer";
                }else {
                    return "fall";
                }
            }
        }

    }
}