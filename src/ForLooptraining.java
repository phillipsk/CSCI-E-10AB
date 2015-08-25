/**
 * Created by Kevin Phillips on 8/25/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach.
 * Chapter 2.3
 */
public class ForLooptraining {
    public static void main(String[] args) {
//        Thought this for loop involved a predecrement operator at first glance, thus tested
        for (int i =-10; i <= -1; i++){
/*
            System.out.println(i);
            System.out.println("+-------------+");
*/
        }
//        Testing local variable scope
        int i;
        for ( i = 1; i <= 5; i++){
            for( i = 1; i <= 10; i++){
                System.out.println( i + " hi there.");
            }
        }

    }
}
