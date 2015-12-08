package Pset41;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/7/15
 */
public class Bool {
    public static int fullOfBool(boolean[] list){
        for (int i = 0; i < list.length; i++){
            if (list[i]){
                System.out.println("The first 'true' value is found at location " + i);
                break;
//                return -1;
            }else {
                System.out.println("There are no 'true' values.");
            }
        }
//        int last = list.length - 1;
        for (int i = list.length - 1; i >= 0; i--){
            if (list[i]){
                System.out.println("The last 'true' value is found at location " + i);
                break;
//                return -1;
            }else {
                System.out.println("There are no 'true' values.");
            }
        }
        int counter = 0;
        for (int i = 0; i < list.length; i++){
            if (list[i]){
                counter++;
//                break;
//                return -1;
            }
        }
        System.out.println("The most consecutive 'true' value(s) are " + counter);
        return 0;
    }


    public static void main(String[] args) {
        boolean [] test1 = {false, true, true, true};
        boolean [] test2 = {true};
        boolean [] test3 = {true, true, true, true, false};
        System.out.println("fullOfBool(test1);");
        fullOfBool(test1);
        System.out.println();
        System.out.println("fullOfBool(test2);");
        fullOfBool(test2);
        System.out.println();
        System.out.println("fullOfBool(test3);");
        fullOfBool(test3);
    }
}