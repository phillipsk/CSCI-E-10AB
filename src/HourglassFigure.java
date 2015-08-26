/**
 * Created by Kevin Phillips on 8/26/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach.
 * Chapter 2.5
 */
public class HourglassFigure {
    public static void main(String[] args) {
        drawLine();
        System.out.println();
        topHalf();
    }

    public static void drawLine(){
        System.out.print("+");
            for (int i = 1;i < 7;i++){
                System.out.print("-");
            }
        System.out.print("+");
    }

    public static void topHalf(){
//        total lines
        for (int line = 1; line < 4; line++){
            System.out.print("|");
            System.out.print("\\");
//            spaces
            for (int i = 1; i <= (line-1); i++){
                System.out.print(" ");
            }
//            dots
            for (int i=1;i<=(6-(2*line));i++){
                System.out.print(".");
            }
            System.out.print("/");
            System.out.print("|");
            System.out.println();
        }
    }

}
