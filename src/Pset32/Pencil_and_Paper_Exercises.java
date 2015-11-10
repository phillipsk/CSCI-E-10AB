package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/10/2015
 */
public class Pencil_and_Paper_Exercises {
    public static void main(String[] args) {
/*        String s = "Java, Java, Java";
        System.out.println(s.substring(0, 4)); // == "Java" True
        System.out.println(s.lastIndexOf("av"));
        System.out.println(s.indexOf('a', 5));
        System.out.println(s.indexOf("av", s.length() - 10));
        System.out.println(s.substring(s.lastIndexOf(s.charAt(5))));
        System.out.println(s.substring (2, s.length() - 3));*/

//        System.out.println(printLetters("Rabbit"));
        printLetters("Rabbitss");
    }

    public static void printLetters (String text)
    {

        for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));
//            System.out.print(text.indexOf(text.charAt(i)));
            int a = text.lastIndexOf(text.charAt(i));
            int b = text.length()-1;
//            System.out.println(text.length()-1);
            if (text.lastIndexOf(text.charAt(i)) < (text.length()-1) ){
                System.out.print("-");
            }
        }
        System.out.println(); // to end the line of output
    }

}
