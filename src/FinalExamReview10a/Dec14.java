package FinalExamReview10a; /** Lnim.java
 *  "learns" how to play the very simple game of NIM
 *  through experience with a human user.
 *
 *  @author:  Dr. Henry H. Leitner
 *  @version: Last Modified November 12, 2015
 */
import java.util.*;

public class Dec14
{
    static final int SCORE_ROW = 2;
    static final int A_SCORE_COL = 10;
    static final int B_SCORE_COL = 40;
    static final int GAME_INTERACTION_ROW = 13;
    static final int PLAY_AGAIN_PROMPT_ROW = 16;
    static final int PLAY_AGAIN_PROMPT_COL = 40;
    static final int TOTAL_MATCHES = 11;                 // # of matches to play with
    static int aScore = 0;
    static int bScore = 0;

    static void play1GameOfNim (Table aMoves, Table bMoves, Table history)
    {
        int m;
        boolean gameOver = false;             // We haven't started playing yet!
        Scanner keyboard = new Scanner(System.in);

        TxtGrph.position (GAME_INTERACTION_ROW, 1);
        TxtGrph.eraseDown ();

        int matchesLeft = TOTAL_MATCHES;

        while ( ! gameOver )
        {                                    		      // Let player A go first
            m = history.takeSomeMatches (matchesLeft);
            aMoves.setValue (m, matchesLeft, 1);       	  // record that move
            matchesLeft -= m;  			                  // remove M matches
            // from the pile
            System.out.println ("A takes " + m + " matches, leaving " +
                    matchesLeft);

            if (matchesLeft == 1)             		      // did player A win??
            {
                history.reinforce (aMoves, bMoves);       // yes; remember
                // the experience
                aScore++;                                 // and tally the win.
                gameOver = true;
            }
            else                                          // Now player B goes
            {
                m = history.takeSomeMatches (matchesLeft);

                bMoves.setValue (m, matchesLeft, 1);       // record B's move
                matchesLeft -= m;  			   // remove M matches
                // from the pile
                System.out.println ("B takes " + m + " matches, leaving " +
                        matchesLeft);

                if (matchesLeft == 1)                      // did player B win??
                {
                    history.reinforce (bMoves, aMoves);     // yes; remember
                    // the experience
                    bScore++;                               // and tally the win.
                    gameOver = true;
                }
            }
        }
        TxtGrph.position (SCORE_ROW, A_SCORE_COL);
        System.out.print ("A score:  " + aScore);
        TxtGrph.position (SCORE_ROW, B_SCORE_COL);
        System.out.print ("B score: " + bScore);
        TxtGrph.beep();
        history.displayValues();
        TxtGrph.position(PLAY_AGAIN_PROMPT_ROW, PLAY_AGAIN_PROMPT_COL);
    }


    public static void main (String [] args)
    {
        Table aMoves  = new Table (4, TOTAL_MATCHES+1);
        Table bMoves  = new Table (4, TOTAL_MATCHES+1);
        Table history = new Table (4, TOTAL_MATCHES+1);

        String playAgain;
        Scanner keyboard = new Scanner (System.in);
        history.displayOutline();                      // show history boxes
        do
        {
            aMoves.initialize (0);
            bMoves.initialize (0);

            play1GameOfNim (aMoves, bMoves, history);

            System.out.print ("Do you want to play again? ");
            playAgain = "yes";

            try { Thread.sleep (500); }
            catch (Exception e) {};

        } while (playAgain.charAt(0)  != 'N' && playAgain.charAt(0) != 'n');

        System.out.println("\n\n");
    }
}