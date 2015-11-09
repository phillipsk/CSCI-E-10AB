package pset3;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/6/15
 */
public class TwoRandom {
    /*
    * This program evaluates two pseudo-random numbers through the use of the Math.random class. If the difference
    * between both random numbers, defined by r1 and r2 is zero, the method indicates a tie through a printed statement.
    * Likewise, if the resulting difference is not zero, but an even number, a victorious message is printed. Finally,
    * a "You lose" message is printed to the console if the difference evaluates to an odd nuber.
    * */
    public static void main(String[] args){
        int r1  = (int) (Math.random() * 7) + 1;
        int r2  = (int) (Math.random() * 7) + 1;
        System.out.println("Random number #1 = " + r1);
        System.out.println("Random number #2 = " + r2);
        if ( (r1-r2 == 0) || (r2-r1 == 0)){
            System.out.println("A tie!");
        }else if ((r1-r2) % 2 == 0 || (r2-r1) % 2 == 0){
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }
    }
}