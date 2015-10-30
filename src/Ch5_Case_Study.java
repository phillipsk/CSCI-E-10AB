/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/30/15
 */
public class Ch5_Case_Study {
    public static void main(String [] args){
        matches(20, 40);
    }

    public static int matches(int number, int guess){
        int numMatches = 0;

        if (guess / 10 == number / 10
                || guess / 10 == number % 10){
            numMatches++;
        }

        if (guess / 10 != guess % 10 &&
                (guess % 10 == number / 10 ||
                guess % 10 == number % 10)){
            numMatches++;
        }
        return  numMatches;
    }
}
