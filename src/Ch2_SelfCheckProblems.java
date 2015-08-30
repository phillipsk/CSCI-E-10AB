/**
 * Created by Kevin Phillips on 8/28/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter 2 Self-Check Problems & Exercises
 */
public class Ch2_SelfCheckProblems {

    public static final int SIZE = 5;

    public static void main(String[] args) {
/*        System.out.println("Practice:");
        question34();
        System.out.println("Partially correct:");
        q34();
        System.out.println("Solution, scalable with constant:");
        solution34();*/
        ex2();


    }

    public static void ex2(){
        for (int i = 81; i <= 289; i=i+19){
                /*for (int j = 1; j >=( i - 81 );j++){
//                    System.out.print(j+" ");
//                    System.out.print(i + " ");
                }*/
//            System.out.print(i + " ");
        }
//        System.out.println();

        for (int k = 9; k <=17; k++){
            int t = 0;
            for(int j = 0;j < k;j++){
                t += k;
            }
            System.out.print(t + " ");
//            System.out.print( k * k +" ");
        }
        System.out.println();

/*        for (int k = 81; k <=289; k++){
            for (int j = 1; j <= 1; j++){
                k = k + 8;
            }
            System.out.print( k +" ");
        }*/

//        Alternate version
        for (int r = 64, k = 9; k < 18; k++) {
            r += k + k - 1;
            System.out.print(r+" ");
        }
        System.out.println();
    }



    /** For Question 34 & 35
     * Table 6 lines; CONSTANT = 6
     * Line 1   ! = 22  \ = 0   / = 0
     * Line 2   ! = 18  \ = 2   / = 2
     * Line 3   ! = 14  \ = 4   / = 4
     * Line 4   ! = 10  \ = 6   / = 6
     * Line 5   ! = 6   \ = 8   / = 8
     * Line 6   ! = 2   \ = 10  / = 10
     *
     * Table 4 lines; CONSTANT = 4
     * Line 1   ! = 14  \ = 0   / = 0
     * Line 2   ! = 10  \ = 2   / = 2
     * Line 3   ! = 6   \ = 4   / = 4
     * Line 4   ! = 2   \ = 6   / = 6
     */
    public static void  question34(){

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

    public static void solution34(){
        for (int line = 1; line <= SIZE; line++){
            for(int i = 1; i<=((2 * line) - 2); i++){
                System.out.print("\\");
            }
            for (int i = 1; i <= ( -4 * line + ( 4 * SIZE + 2 ) ); i++){
                System.out.print("!");
            }
            for(int i = 1; i<= ((2 * line) - 2); i++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}