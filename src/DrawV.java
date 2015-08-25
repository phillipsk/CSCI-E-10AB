/**
 * Created by Kevin Phillips on 8/25/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach.
 * Chapter 2.4
 */
public class DrawV {
    public static final int LINES = 50;

    public static void main(String[] args) {
//        drawV();
//        decrementV();
//        constantV();
        finalConstant();
    }


//      Produces any number of lines in a perfect pyramid V
    public static void finalConstant(){
        for (int line = LINES; line >= 1; line--){
            for (int i = 1; i <= (line - 1); i++){
                System.out.print(" ");
            }
            int stars = 2 * LINES + 1 - 2 * line;
            for (int i = 1; i <= stars; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


// use of a constant value = FINAL
    public static void constantV(){
            for (int line = 1; line <= 5; line++){
                for (int i = 1; i <= (line - 1); i++){
                    System.out.print(" ");
                }
                int stars = 2 * LINES + 1 - 2 * line;
                for (int i = 1; i <= (2 * LINES +1 - (2 * line)); i++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    public static void drawV(){
        for (int line = 1; line <= 5; line++){
            for (int i = 1; i <= (line - 1); i++){
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - (2 * line)); i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void decrementV(){
//        Decrement the loop with a decrement " x-- " operator
//      for (int line = 1; line <= 5; line++){
        for (int line = 5; line >= 1; line--){
            for (int i = 1; i <= (line - 1); i++){
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - (2 * line)); i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
