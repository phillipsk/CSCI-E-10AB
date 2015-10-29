package pset2;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/26/15
 */
public class MidtermPractice {


    public static void main(String args[]){
/*        System.out.println(1 % 3);
        System.out.println(1 / 3.0);*/

/*        final char STAR = '*';
        final char DOT = '.';

        for(int i =1; i <5; i++){
            for (int j = 1; j <= 5; j++){
                if (((i-3)*(i-3)+(j-3)*(j-3)) < 5) {
                    System.out.print(STAR);

                }   else {
                    System.out.print(" " + DOT);
                }
//                System.out.println();
            }
        }*/


        /*int score = 65;
        if ( 84 <= score <= 92){

        }*/
        Scanner console = new Scanner(System.in);
        double g = console.nextDouble();
        int t = console.nextInt();
        int h = console.nextInt();
        System.out.println(graduation(g,t,h));
    }

    public static String graduation(double GPA, int Tcredits, int Hcredits){
        if (GPA < 2.0 || Tcredits < 180){
            return "not graduating";
        }

        else if (GPA < 3.6){
            return "graduating";
        }

        else if (Hcredits < 15) {
            if (GPA >= 3.6 && GPA < 3.8) {
                return "cum laude";
            } else {
                return "magna cum laude";
            }
        }

        else {
            if (GPA < 3.8) {
                return "magna cum laude";
            } else {
                return "summa cum laude";
            }
        }
    }

}