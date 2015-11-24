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

//        ,e,i,o,u,y;
//        int start = 0;
//        int stop = 0;
//        String sOneVowel = "";

        int spaces = 0;
        int counter = 0;
        int length = s.length();

//        First Word only
        int aCounter= 0; int eCounter =0; int iCounter=0; int oCounter = 0; int uCounter = 0; int yCounter =0;
        NoNoVowels(s, aCounter,eCounter,iCounter,oCounter,uCounter,yCounter);

//        remaining words
        for (int j = 0; j < length; j++) {

            if (s.charAt(j) == ' ') {
//                System.out.print(" " + firstWord(s, j) + " ");
                System.out.print(' ');
                NoNoVowels(firstWord(s, j),aCounter,eCounter,iCounter,oCounter,uCounter,yCounter);
                spaces++;
//                start = spaces;
                spaces += j;
            }
        }
    }

//            I am aware this method iterates over every char, I would preferably like to save the iterations
//              if only the char were vowels
    public static void NoNoVowels(String s, int counter1, int counter2, int counter3, int counter4, int counter5, int counter6) {
        String sOneVowel;
        for (int k = 0; k < 1; k++) {
//            System.out.println(firstWord(s, k));
            sOneVowel = firstWord(s, k);
            for (int kk = 0; kk < sOneVowel.length(); kk++) {

                if (counter1 == 1 && sOneVowel.charAt(kk) == 'a' || sOneVowel.charAt(kk) == 'A' ){
                    counter1++;
                }else{
                    counter1++;
                }
                if(counter2 == 1 && sOneVowel.charAt(kk) == 'e' || sOneVowel.charAt(kk) == 'E'){
                    counter2++;
                }else {
                    counter2++;
                }
                if (counter3 == 1 && sOneVowel.charAt(kk) == 'i' || sOneVowel.charAt(kk) == 'I'){
                    counter3++;
                }else {
                    counter3++;
                }
                if (counter4 == 1 && sOneVowel.charAt(kk) == 'o' || sOneVowel.charAt(kk) == 'O'){
                    counter4++;
                }else {
                    counter4++;
                }
                if (counter5 == 1 && sOneVowel.charAt(kk) == 'u' || sOneVowel.charAt(kk) == 'U'){
                    counter5++;
                }else {
                    counter5++;
//                    System.out.print(sOneVowel.charAt(kk));
                }
                if (counter6 == 1 && sOneVowel.charAt(kk) == 'y' || sOneVowel.charAt(kk) == 'Y') {
                    counter6++;
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
                } else if(sOneVowel.charAt(kk) == 'a' && counter1 < 2 || sOneVowel.charAt(kk) == 'A'  && counter1 < 2
                        ||  sOneVowel.charAt(kk) == 'e' && counter2 < 2 || sOneVowel.charAt(kk) == 'E'&& counter2 < 2
                        ||  sOneVowel.charAt(kk) == 'i' && counter3 < 2 || sOneVowel.charAt(kk) == 'I'&& counter3 < 2
                        ||  sOneVowel.charAt(kk) == 'o' && counter4 < 2 || sOneVowel.charAt(kk) == 'O'&& counter4 < 2
                        ||  sOneVowel.charAt(kk) == 'u' && counter5 < 2 || sOneVowel.charAt(kk) == 'U'&& counter5 < 2
                        ||  sOneVowel.charAt(kk) == 'y' && counter6 < 2 || sOneVowel.charAt(kk) == 'Y'&& counter6 < 2){
                    System.out.print(sOneVowel.substring(kk, kk + 1)); {
//                    System.out.print(sOneVowel.substring(kk, kk + 1));
                    }
                } //Dsrbl unfrnshd flt in qt rsdntl ar
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

}
