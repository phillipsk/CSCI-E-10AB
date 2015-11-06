package pset3;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/6/15
 */
public class TwoRandom {
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

        /*else if ((r1-r2 == 1) || (r2-r1 == 1) || (r1-r2 == 3) || (r2-r1 == 3) || (r1-r2 == 5) || (r2-r1 == 5)){
            System.out.println("You lose!");
        }else if ((r1-r2 == 2) || (r2-r1 == 2) || (r1-r2 == 4) || (r2-r1 == 4) || (r1-r2 == 6) || (r2-r1 == 6)){
            System.out.println("You win!");
        }*/
    }
}