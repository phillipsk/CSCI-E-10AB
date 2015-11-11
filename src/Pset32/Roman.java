package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/2015
 */
public class Roman {
    public static void main(String[] args) {
        System.out.println(romanToArabic("LXXXVII"));       // 87
        System.out.println(romanToArabic("CCXIX"));         // 219
        System.out.println(romanToArabic("MCCCLIV"));       // 1354
        System.out.println(romanToArabic("MMDCLXXIII"));    // 2673
        System.out.println(romanToArabic("MCDLXXVI"));      // 1476
//        System.out.println(romanToArabic(""));
//        System.out.println(romanToArabic(""));
    }

    public static int romanToArabic(String s){
        int M = 1000;
        int D = 500;
        int C = 100;
        int L = 50;
        int X = 10;
        int V = 5;
        int I = 1;

        s = s.toUpperCase();
        int a_number = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'M'){
                a_number+= M;
            }else if (s.charAt(i) == 'D'){
                a_number+= D;
            }else if (s.charAt(i) == 'C'){
                a_number+= C;
            }else if (s.charAt(i) == 'L'){
                a_number+= L;
            }else if (s.charAt(i) == 'X'){
                a_number+= X;
            }else if (s.charAt(i) == 'V'){
                a_number+= V;
            }else {
                a_number+= I;
            }
        }
        return a_number;
    }
}
