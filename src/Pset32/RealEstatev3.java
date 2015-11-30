package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class RealEstatev3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Please enter an advertisement: ");
        Scanner console = new Scanner(System.in);
//        String advertisement = console.nextLine();
        String advertisement = "Desirable unfurnished flat in quiet residential area";
//        System.out.println(advertisement);
//        System.out.println(noVowels(advertisement));
        noVowels(advertisement);
//        System.out.println(firstWord(advertisement));
//        System.out.println("");
        System.out.println("\nDsrbl unfrnshd flt in qt rsdntl ar");
    }

    /**
     * @param s
     */
    public static void noVowels(String s) {

//        ,e,i,o,u,y;
//        int start = 0;
//        int stop = 0;
//        String sOneVowel = "";

        int spaces = 0;
        int counter = 0;
        int length = s.length();

//        First Word only
        int aCounter = 0; int eCounter = 0; int iCounter = 0; int oCounter = 0; int uCounter = 0; int yCounter = 0;
        int counter1a = 0; int counter2a = 0; int counter3a = 0; int counter4a = 0; int counter5a = 0; int counter6a = 0;
        NoNoVowels(s, aCounter,eCounter,iCounter,oCounter,uCounter,yCounter,
                counter1a,counter2a,counter3a,counter4a,counter5a,counter6a);

//        remaining words
        for (int j = 0; j < length; j++) {

            if (s.charAt(j) == ' ') {
//                System.out.print(" " + firstWord(s, j) + " ");
                System.out.print(' ');
                NoNoVowels(firstWord(s, j),aCounter,eCounter,iCounter,oCounter,uCounter,yCounter,
                        counter1a,counter2a,counter3a,counter4a,counter5a,counter6a);
                spaces++;
//                start = spaces;
                spaces += j;
            }
        }
    }

    /**
     * @param s
     * @param counter1
     * @param counter2
     * @param counter3
     * @param counter4
     * @param counter5
     * @param counter6
     */
//            I am aware this method iterates over every char, I would preferably like to save the iterations
//              if only the char were vowels
    public static void NoNoVowels(String s, int counter1, int counter2, int counter3, int counter4, int counter5, int counter6,
                                  int counter1a,int counter2a,int counter3a,int counter4a,int counter5a,int counter6a) {
        String sOneVowel;

        for (int k = 0; k < 1; k++) {
//            System.out.println(firstWord(s, k));
            sOneVowel = firstWord(s, k);
            for (int kk = 0; kk < sOneVowel.length(); kk++) {

                if (sOneVowel.charAt(kk) == 'a' || sOneVowel.charAt(kk) == 'A' ){
                    counter1a++;
                    counter1++;
                }else{
                    counter1++;
                }
                if(sOneVowel.charAt(kk) == 'e' || sOneVowel.charAt(kk) == 'E'){
                    counter1a++;
                    counter2++;
                }else {
                    counter2++;
                }
                if (sOneVowel.charAt(kk) == 'i' || sOneVowel.charAt(kk) == 'I'){
                    counter1a++;
                    counter3++;
                }else {
                    counter3++;
                }
                if (sOneVowel.charAt(kk) == 'o' || sOneVowel.charAt(kk) == 'O'){
                    counter4++;
                    counter1a++;
                }else {
                    counter4++;
                }
                if (sOneVowel.charAt(kk) == 'u' || sOneVowel.charAt(kk) == 'U'){
                    counter5++;
                    counter1a++;
                }else {
                    counter5++;
                }
                if (sOneVowel.charAt(kk) == 'y' || sOneVowel.charAt(kk) == 'Y') {
                    counter6++;
                    counter1a++;
                } else{
                    counter6++;
                }
                if (sOneVowel.charAt(kk) != 'a' && sOneVowel.charAt(kk) != 'A'
                        && sOneVowel.charAt(kk) != 'e' && sOneVowel.charAt(kk) != 'E'
                        && sOneVowel.charAt(kk) != 'i' && sOneVowel.charAt(kk) != 'I'
                        && sOneVowel.charAt(kk) != 'o' && sOneVowel.charAt(kk) != 'O'
                        && sOneVowel.charAt(kk) != 'u' && sOneVowel.charAt(kk) != 'U'
                        && sOneVowel.charAt(kk) != 'y' && sOneVowel.charAt(kk) != 'Y'){
                    System.out.print(sOneVowel.substring(kk, kk + 1));
//                    counter1++; counter2++; counter3++; counter4++; counter5++; counter6++;
                } else if(sOneVowel.charAt(kk) == 'a' && counter1a < 1 || sOneVowel.charAt(kk) == 'A'  && counter1a < 1
                        ||  sOneVowel.charAt(kk) == 'e' && counter1a < 1 || sOneVowel.charAt(kk) == 'E'&& counter2a < 1
                        ||  sOneVowel.charAt(kk) == 'i' && counter1a < 1 || sOneVowel.charAt(kk) == 'I'&& counter3a < 1
                        ||  sOneVowel.charAt(kk) == 'o' && counter1a < 1 || sOneVowel.charAt(kk) == 'O'&& counter4a < 1
                        ||  sOneVowel.charAt(kk) == 'u' && counter1a < 1 || sOneVowel.charAt(kk) == 'U'&& counter5a < 1
                        ||  sOneVowel.charAt(kk) == 'y' && counter1a < 1 || sOneVowel.charAt(kk) == 'Y'&& counter6a < 1){
                    System.out.print(sOneVowel.substring(kk, kk + 1)); {
//                    System.out.print(sOneVowel.substring(kk, kk + 1));
                    }
                } //Dsrbl unfrnshd flt in qt rsdntl ar
            }
        }
    }

    /**
     * Learned of this method from chapter 5 of the Reges textbook.
     *
     * @param s
     * @param start
     * @return
     */
    public static String firstWord(String s, int start) {
//        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        int stop = start;
        while (stop < s.length() && s.charAt(stop) != ' ') {
            stop++;
        }
        return s.substring(start, stop);
    }

}
