package pset3;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/28/2015
 */
public class partA_Non_Programming {

    public static void main(String[] args) {
//        deMorgan();
//        q_2(); System.out.println(" New Q"); q_2_while();
        sorted(3.4,5.5,8.1);    // sorted
        sorted(3.4,8.1,5.5);    // unsorted
        sorted(3.4,3.4,5.5);    // sorted
        sorted(3.4,5.5,3.4);    // unsorted
//        sorted(3.4,3.4,5.5);
    }

    public static boolean sorted(double x, double y, double z){
        if (x <= y && x <= z && y <= z){
            System.out.println("TRUE - Sorted");
            return true;
        }else {
            System.out.println("FALSE - Unsorted");
            return false;
        }
    }

    public static void q_2(){
        int i = 8;
        int j = 13;
        do {
            i++;
            j++;
            System.out.println(i * j);
        }
        while ((i < 10) && (j * j != 25));
    }

    public static void q_2_while(){
        int i = 8;
        int j = 13;
        int times = 0;
        if (i >= 10) {
            if (times == 0) {
                i++;
                j++;
                System.out.println(i * j);
                times++;
            }
        }else {
            while ((i < 10) && (j * j != 25)){
                i++;
                j++;
                System.out.println(i * j);
            }
        }
    }

    public static void deMorgan() {
        boolean a = true;
        boolean b = false;
        int x = 3;
        int y = 5;
        int number = 0;
//        !(p && q) --> !p || !q
//        !(a && b) --> !a || !b

//        !(a || b) --> !a && !b

//        Hw
//        ! (x != 0 || y != 0) -->  x = 0 && y = 0
//        or
//        ! (x != 2 || y != 6) -->  !(x = 2 && y = 6)
//        x = 2 || y = 6    -->     x != 2 && y != 6

        while (!(x % 2 != 0 || y % 2 != 0)) {
//            if (number % 2 == 0) //even
            System.out.println("Even");
        }
        while (x % 2 == 0 && y % 2 == 0) {
//            if (number % 2 == 0) //even
            System.out.println("Even");
        }
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
