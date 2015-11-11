package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/15
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(season(12,31));

    }

    public static String season(int month, int day){
//            error checking needed for 15/3 values
        if (month > 12 || day > 31){
            return "impossible";
        }else {

            if (month >= 12 && day >= 16 || month <= 3 && day <=15){
                return "winter";
            }else if (month >= 3 && day >= 16 || month <= 6 && day <=15){
                if (month == 2 && day > 28){
                    return "impossible";
                }else {
                    return "spring";
                }
            }else if (month >= 6 && day >= 16 || month <= 9 && day <=15){
                return "summer";
            }else {
                return "fall";
            }
        }

    }
}