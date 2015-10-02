import java.util.Scanner;

/**
 * Created by Kevin Phillips on 10/2/15.
 */
    class Conjecture {
        public static void main(String[] args){
//            euler();
            eulerWhile();
        }

        static void euler(){
            Scanner console = new Scanner(System.in);
            System.out.println("Please enter the first three integers for Euler's conjecture: ");
/*            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();*/
            int a = 24;
            int b = 87;
            int c = 110;

            System.out.println("\nPlease enter the exponent: ");
//            int n = console.nextInt();
            int n = 5;

            double solutionLHS = (int) Math.pow(a,n)+Math.pow(b,n)+Math.pow(c,n);

//            int solutionLHS = a*n + b*n + c*n;
            System.out.println((int)solutionLHS);
//            System.out.println(int (solutionLHS);

            System.out.println("\nPlease enter the last integer: ");
//            int d = console.nextInt();
            int d = 113;

            double solutionRHS = (int) Math.pow(d,n);
//            int solutionRHS = d*n;
            System.out.println((int)solutionRHS);

            if((int)solutionLHS == solutionRHS){
                System.out.println("\nYou have disproved Euler's conjecture.");
            }


        }

    static void eulerWhile(){
//        int solutionLHS, solutionRHS;
        int a = 2;
        int b = 2;
        int c = 2;
        int d = 2;
        int n = 5;

        double solutionLHS = (int) Math.pow(a,n)+Math.pow(b,n)+Math.pow(c,n);
        double solutionRHS = (int) Math.pow(d,n);

        while((int) solutionLHS != solutionRHS){
            System.out.println(a + b + c + d);
            a++;
            b++;
            c++;
            d++;
            System.out.println(a + b + c + d);
        }

        System.out.println("\nYou have disproved Euler's conjecture.");

    }
}
