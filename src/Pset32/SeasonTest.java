package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/15
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(season(5,31));
        System.out.println(season(2,29));
        System.out.println(season(8,31));
        System.out.println(season(8,30));
        System.out.println(season(9,10));
        System.out.println(season(5,31));
        System.out.println(season(11,31));
        System.out.println(season(11,31));
    }

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