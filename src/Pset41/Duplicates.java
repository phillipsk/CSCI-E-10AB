package Pset41;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/16/15
 */
public class Duplicates {

    public static String[]removeDuplicates(String[] list){
        String s = "";
        char c = 0;
        for (int i = 0; i < list.length; i++){
//            System.out.println(list[i]);
            c = list[i].charAt(i);
            System.out.println(c);

        }
        return list;
    }

    public static void main(String[] args) {
        String [] values = {"A", "C", "C", "B", "A", "C", "B", "B", "A"};
        String [] newList = removeDuplicates (values);
        for(int i = 0; i < newList.length; i++){
//            System.out.print (values[i] + " ");
        }
        System.out.println();
        System.out.println(newList);

    }
}