package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/24/2015
 */
public class PigLatin {
    public static void main(String[] args) {
        piggie("deepest");  //  “deepest” gets translated into “eepest-day”
        piggie("shade");    //  “shade” gets translated to “ade-shay”
        piggie("Obama");    //  “Obama” gets translated to “Obama-way”, and
        piggie("you");      //  “you” gets translated to “ou-yay”
        piggie("queen");    //  “queen” gets translated to “een-quay” (note the ‘u’ stays with ‘q’)
        piggie("by");       //  “by” gets translated to “y-bay” (note that ‘y’ is a vowel)
    }

    public static String piggie(String s){
//        String
        for (int k = 0; k < s.length(); k++){
            if (s.charAt(k) == 'a' || s.charAt(k) == 'e' || s.charAt(k) == 'i' ||
                    s.charAt(k) == 'o' || s.charAt(k) == 'u' || s.charAt(k) == 'y'){
//                System.out.print(k);
            }else {
                System.out.print(s.substring(1,s.length())+ "-" + s.substring(0,1) + "ay ");
                break;
            }
        }
        System.out.println();


        return s;
    }
}
