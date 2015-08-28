    /**
     * Created by Kevin Phillips on 8/26/15.
     * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach.
     * Chapter 2.5
     */
    public class HourglassFigure {

        public static final int SUB_HEIGHT = 4;

        public static void main(String[] args) {
            drawLine();
//            removed this by changing line 30 from print to println
//            System.out.println();
            topHalf();
            bottomHalf();
            drawLine();
            bottomHalf();
            topHalf();
            drawLine();
        }

        public static void drawLine(){
            System.out.print("+");
            for (int i = 1; i <= SUB_HEIGHT * 2; i++){
                System.out.print("-");
            }
//            System.out.print("+");
            System.out.println("+");
        }

        public static void topHalf(){
//        total lines
            for (int line = 1; line <= SUB_HEIGHT; line++){
                System.out.print("|");

    //            LHS spaces
                    for (int i = 1; i <= (line-1); i++){
                        System.out.print(" ");

                    }
                    System.out.print("\\");
    //            dots
                    for (int i = 1; i <= ((2 * SUB_HEIGHT) - ( 2 * line)); i++){
                        System.out.print(".");
                    }
                    System.out.print("/");
//                RHS spaces
                    for (int i = 1; i <= (line-1); i++){
                        System.out.print(" ");

                    }
                    System.out.print("|");
                System.out.println();
            }
        }
        public static void bottomHalf(){
//        total lines
            for (int line = SUB_HEIGHT; line >= 1; line--){
                System.out.print("|");

    //            LHS spaces
                    for (int i = 1; i <= (line-1); i++){
                        System.out.print(" ");

                    }
                    System.out.print("/");
    //            dots
                    for (int i=1; i <= ((2 * SUB_HEIGHT)-( 2 * line)); i++){
                        System.out.print(".");
                    }
                    System.out.print("\\");
//                RHS spaces
                    for (int i = 1; i <= (line-1); i++){
                        System.out.print(" ");

                    }
                    System.out.print("|");
                    System.out.println();
            }
        }
    }

