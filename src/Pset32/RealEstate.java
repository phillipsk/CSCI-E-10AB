package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class RealEstate {
    //    public final String  ADVERTISEMENT = "Desirable unfurnished flat in quiet residential area";
    public final int CONSTANT = 1;

    public static void main(String[] args) {
        System.out.println("Please enter an advertisement: ");
        Scanner console = new Scanner(System.in);
//        String advertisement = console.nextLine();
        String advertisement = "Desirable unfurnished flat in quiet residential area";
//        System.out.println(advertisement);
//        System.out.println(noVowels(advertisement));
        noVowels(advertisement);
//        System.out.println(firstWord(advertisement));
    }

    public static void noVowels(String s) {
        char a;
        int spaces = 0;
//        ,e,i,o,u,y;
        int start = 0;
        int stop = 0;
        String sOneVowel = "";
        int counter = 0;

        char finalWord = ' ';
        int length = s.length();
        for (int k = 0; k < 1; k++) {
            System.out.println(firstWord(s, k));
            sOneVowel = firstWord(s, k);
            for (int kk = 0; kk < sOneVowel.length(); kk++) {

                if (counter == 0 && sOneVowel.charAt(kk) == 'a' || counter == 0 && sOneVowel.charAt(kk) == 'e' ||
                        counter == 0 && sOneVowel.charAt(kk) == 'i' || counter == 0 && sOneVowel.charAt(kk) == 'o' ||
                        counter == 0 && sOneVowel.charAt(kk) == 'u' || counter == 0 && sOneVowel.charAt(kk) == 'y') {
                    counter++;
                } else {
                    System.out.print(sOneVowel.substring(kk, kk + 1));

                }
            }
            System.out.println();
        }
        for (int j = 0; j < length; j++) {

            if (s.charAt(j) == ' ') {
                System.out.println(firstWord(s, j));
                spaces++;
                start = spaces;
                spaces += j;
            }
        }
    }

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

    public static String removeFirstVowels(String s) {
        String sOneVowel = "";
        int counter = 0;
        for (int k = 0; k < 1; k++) {
            System.out.println(firstWord(s, k));
            sOneVowel = firstWord(s, k);
            for (int kk = 0; kk < sOneVowel.length(); kk++) {

                if (counter == 0 && sOneVowel.charAt(kk) == 'a' || counter == 0 && sOneVowel.charAt(kk) == 'e' ||
                        counter == 0 && sOneVowel.charAt(kk) == 'i' || counter == 0 && sOneVowel.charAt(kk) == 'o' ||
                        counter == 0 && sOneVowel.charAt(kk) == 'u' || counter == 0 && sOneVowel.charAt(kk) == 'y') {
                    counter++;
                } else {
//                    System.out.print(sOneVowel.substring(kk, kk + 1));
                    s = sOneVowel.substring(kk, kk + 1);
                }
            }
            System.out.println();
        }
        return s;
    }
}
