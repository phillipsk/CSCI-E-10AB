package pset3;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/28/2015
 */
public class partA_Non_Programming {
    public final int I = 14;
    public final int J = 13;
    public static void main(String[] args) {
        q_2(); q_2_while();
    }

    public static void q_2(){
        int i = 2;
        int j = 13;
        do {
            i++;
            j++;
            System.out.println(i * j);
        }
        while ((i < 10) && (j * j != 25));
    }

    public static void q_2_while(){
        int i = 2;
        int j = 13;
        while ((i < 10) && (j * j != 25)){
            i++;
            j++;
            System.out.println(i * j);
        }
    }

    public static void deMorgan(){
        boolean a = true;
        boolean b = false;
//        !(p && q) --> !p || !q
//        !(a && b) --> !a || !b

//        !(a || b) --> !a && !b

//        Hw
//        ! (x != 0 || y != 0) -->  !(x != 0 && y != 0)
//        or
//        ! (x != 2 || y != 6) -->  !(x = 2 && y = 6)
//        x = 2 || y = 6    -->     x = 2 && y = 6
    }

    public static void  q_1(){
        boolean isASmoker = true;
        boolean isMale = true;
        boolean isGoodLooking = true;
        boolean isAbleToRelocate = true;
        int age = 22;
        int height = 72;
        int weight = 160;
        if (isASmoker && isMale && isGoodLooking && isAbleToRelocate == true && 22 <= age && age <= 44 && height <= 72 && weight <= 160){
            System.out.println("Marry Me!");
        } else{
            System.out.println("Get Lost!");
        }
    }
}
