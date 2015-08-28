/**
 * Created by Kevin Phillips on 8/28/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach.
 * Chapter 2 Self-Check Problems
 */
public class Ch2_SelfCheckProblems {
    public static void main(String[] args) {
        question34();
        System.out.println();
        q34();

    }

    public static void  question34(){
/**
 * Table
 * Line 1   ! = 22  \ = 0   / = 0
 * Line 2   ! = 18  \ = 2   / = 2
 * Line 3   ! = 14  \ = 4   / = 4
 * Line 4   ! = 10  \ = 6   / = 6
 * Line 5   ! = 6   \ = 8   / = 8
 * Line 6   ! = 2   \ = 10  / = 10
 */

        for (int line = 1; line <= 6; line++){
            for (int i = 1; i <= (22-2*(line-1)); i++){
//                for (int j = 1; j <= (line - 1); j++){
//                    System.out.print("\");
//                }
                System.out.print("!");
            }
            System.out.println();
        }
    }

    public static void q34(){
        for (int line = 1; line <= 6; line++){
            for(int i = 1; i<=line-1; i++) {
                System.out.print("\\\\");
            }
            for (int i = 1; i <= 22 -(4*(line-1)); i++){
                System.out.print("!");
            }
            for(int i = 1; i<=line-1; i++) {
                System.out.print("//");
            }
            System.out.println();
        }
    }

}