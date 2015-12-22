package FinalExamReview10a;/* Text Graphics Library. These functions provide basic text graphics.
 *	<p>
 * Adapted from: 
 * Unix Common Graphics Library
 * Modified by HH Leitner, 12/2015

 *
 * 7/14  changed sleep() param from int to double, allowing fractional
 *       seconds of delay.  Should have no effect on existing code.
 *
 * TO BE FIXED, DONE
 *
 *    public static void waitForSpace() { needs stty
 *    public static bool exitProgram() { needs stty
 *    public static bool readScancode (int& code) { not used by other fns
 *			maybe needed to get arrow keys?
 *    public static void getArrows (int& Code) { needs stty 
 *    public static void flushLine() {  not used anywhere; maybe box, grid
 *
 *    SetCursorType(INVISIBLE); THIS FUNCTION IS MISSING, I THINK
 *   public static void cursorOn() { depends on SetCursorType()
 *   public static void cursorOff() {depends on SetCursorType()
 *
 * TO BE CHECKED:
 *    public static void horizLine (int length) { uses funny char on my scrn
 *    public static void vertLine (int length) { uses funny char on my scrn
 *	
 */

/** Text Graphics Library. These functions provide basic text graphics.
 */

import java.io.*;

public class TxtGrph {

//    private static final int  INVISIBLE = 0;       //cursor types
//    private static final int  LINE = 1;
//    private static final char BEEP_CHAR '\u0007'   // ring-the-bell char

    private static final int   MAXCOL = 80;        // Max row length
    private static int  row = 0;
    private static int  col = 0;
    //    private static int  color = 0;
//    private static int  BottomRow = 0;
    private static int  PromptLine = 23;
    private static int  SavedX = 0;
    private static int  SavedY = 0;


    /** Position cursor at specified row and column */
    public static void position (int row, int  column) {
        home();              //  Home cursor to avoid buffer overflow!
        System.out.print("\033" + '[' + row + ';' + column + 'H');
    }

    /** Move cursor up n rows, but not above row 0 
     * This procedure cannot scroll the screen
     */
    public static void up (int n) {
        while( n > 0)
        {
            System.out.print('\033' + "[1A");
            n--;
        }
    }

    /** Move cursor down n rows, but not below row 23
     * Row 24 is reserved for prompts
     * This procedure cannot scroll the screen
     */
    public static void down (int n) {
        while( n > 0)
        {
            System.out.print('\033' + "[1B");
            n--;
        }
    }


    /** Move cursor n columns to right;
     * This command will not move the cursor to a different row
     */
    public static void right (int n) {
        while( n > 0)
        {
            System.out.print('\033' + "[1C");
            n--;
        }
    }

    /** Move cursor n columns to left, but not beyond column 0
     * This command will not move the cursor to a different row
     */
    public static void left (int n) {
        while ( n > 0)
        {
            System.out.print('\033' + "[1D");
            n--;
        }
    }


    /** move the cursor to the top lefthand corner of screen.*/
    public static void home() {
        System.out.print('\033' + "[H");
    }

    /** Store cursor position, overwriting any 
     *  previously saved positions
     */
    public static void saveCursor() {
        SavedX = row;
        SavedY = col;
    }

    /** Restore most recently saved cursor position */
    public static void restoreCursor() {
        row = SavedX;
        col = SavedY;
        position (SavedX, SavedY);
    }

    /** Make cursor visible */
/*    public static void cursorOn() {
        SetCursorType(LINE);
    }
*/

    /** Make cursor invisible */
/*    public static void cursorOff() {
        SetCursorType(INVISIBLE);
    }
*/

    /** Restore to normal video
     * The following function sets the local display
     * so that all characters displayed after this function was called,
     * would display using the default attributes, white-on-black,
     * non-blinking. It has no effect if the default mode is already
     * selected. The characters already on the screen are not changed.

     * These attribute settings affect only the specified positions
     * on the screen.  They may be set either before or after
     * characters are written there. Any combination of bold,
     * underline, and reverse is possible
     */

    public static void setNormal() {
        System.out.print('\033' + "[m");
    }

    /** Put into bold type (extra bright) */
    public static void setBold() {
        System.out.print('\033' + "[1m");
    }

    public static void setUnderline() {
        System.out.print('\033' + "[4m");
    }

    /** Put into reverse video, dark characters on light background.  */
    public static void setReverse() {
        System.out.print('\033' + "[7m");
    }

    /** Erase block of characters on the screen */
    public static void eraseBlock (int top, int left, int bottom, int right) {

        StringBuffer buf = new StringBuffer ();

        for (int col = left; col <= right; col++)
            buf.append (' ');

        for (int row = top; row <= bottom; row++) {
            position (row, left);
            System.out.print (buf);
        }
    }

    /** Erase numchar characters starting at the cursor
     * Does not test for writing past right mrgin.
     */
    public static void eraseChars (int numchar) {
        for( ; numchar > 0; numchar--)
            System.out.print(" ");
    }

    /** Erase from cursor to end of the line */
    public static void eraseRight() {
        System.out.print('\033' + "[0K");
    }

    /** Erase from start of line to cursor */
    public static void eraseLeft() {
        System.out.print('\033' + "[1K");
    }

    /** Erase from cursor to bottom of the screen */
    public static void eraseDown() {
        System.out.print('\033' + "[0J");
    }

    /** Erase from top of screen to cursor.  */
    public static void eraseUp() {
        System.out.print('\033' + "[1J");
    }

    /** Erase entire screen.  */
    public static void eraseAll() {
        System.out.print('\033' + "[2J");
    }

    /** Clear screen then place cursor in upper left corner.  */
    public static void homeAndClear() {
        eraseAll();
        home();
    }

    /** Write a message on the prompt line */
    public static void prompt (String message) {
        setBold();
        position(PromptLine,1);
        System.out.print(message);
        setNormal();
    }

    /** Clears prompt line */
    public static void erasePrompt() {
        eraseBlock(PromptLine,1,PromptLine,79);
    }



    /** Prints a prompt then waits for spacebar to be pressed.  */
/*    public static void waitForSpace() {
        position(PromptLine,1);
        system("stty raw");
        system("stty -echo");
        Prompt("PRESS ENTER TO CONTINUE");
        cin.get();
        ErasePrompt();
        system("stty -raw");
        system("stty echo");
    }
*/

    /** Pauses the machine for n seconds.  */
    public static void sleep (double n) {
        try {
            Thread.currentThread().sleep ((long)(n * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /** Terminates program if ('Y') is pressed */
/*    public static bool exitProgram() {
        bool b;
         system("stty raw");
         system("stty -echo");
        b = Affirmative("TYPE \"Y\" TO EXIT PROGRAM, \"N\" TO CONTINUE ");
        if (b) HomeAndClear();
        system("stty -raw");
        system("stty echo");
        return (b );
   }
*/


    /** Prompts for a 'Y' or 'N' response from the user */
    public static boolean affirmative (String message) {
        char ch = '\0';
        do {
            erasePrompt();
            position (PromptLine,1);    // prompt user with message
            setBold();
            System.out.print (message);
            setNormal();
            try{
                ch = (char) System.in.read();
            }
            catch( IOException e )  {  }
            // ch = Keyboard.readChar();
            System.out.print (" " + ch);
        } while (! (ch == 'Y' || ch =='N' || ch == 'y' || ch =='n'));
        erasePrompt();
        return (ch == 'Y' || ch == 'y');
    }


    /** Beeps the speaker */
    public static void beep() {
        System.out.print("\007");
    }

    /** Wait for a key to be pressed. Return true for any non-ASCII key.
     * Set code to scancode for ASCII character, to extended scancode otherwise
     */
/*    public static bool readScancode (int& code) {
        code  = cin.get();
        if (code == 0) {
            code = cin.get();
            return true;
        }
        else
             return false;
    }
*/

    /** Waits for an arrow key to be pressed.
     * Codes are: arrows (codes 1-4), 'Q' (code 0), RETURN key (code -1)
     * NOTE: CODES ARE ALWAYS 0 IF ARROW KEY NOT PRESSED (C++ vn. bug)
     * See C++ code version in comment following
     */
    public static int getArrows () {
        String noEcho = "stty -echo";
        String echo   = "stty echo";
        String noRaw  = "stty -raw";
        String raw    = "stty raw";
        int in;
        int code = 0;
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(noEcho);
            InputStream sysIn = p.getInputStream();

            rt.exec(raw);
            in = System.in.read();
            System.out.println(in);
            if(in == 27)
            {
                System.out.println("if (in == 27)...");
                in = sysIn.read();
                if (in==91)
                    code = (in = sysIn.read()) - 64;
                rt.exec(noEcho);	// ??
                rt.exec(raw);		// ??
                return code;
            }
            code = 0;
            //		if (in == 13 || in==int('\n')  || in == int('q') || in == int('Q'))
            //			 code = -1;
            //		else code = 0;
            rt.exec(echo);
            rt.exec(noRaw);
            return code;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return code;  // to keep the compiler happy!
    }


/*	this code is actually buggy wrt codes: in = 0 or 1, never 27 (cm, 8/99)
 *	void screen::GetArrows (int& Code)
 *	  {
 *	      system("stty -echo");
 *	      system("stty raw");
 *	      int in;
 *	      Code = -1;
 *	      if(in = int(cin.get()) == 27)
 *	         {
 *	            in = int(cin.get());
 *	            if (in==91) Code = int(cin.get()) - 64;
 *	            system("stty -echo");
 *	            system("stty raw");
 *	            return;
 *	         }
 *	      if (in == 13 || in==int('\n')  || in == int('q') || in == int('Q'))
 *	         Code = -1;
 *	      else Code = 0;
 *	      system("stty echo");
 *	      system("stty -raw");
 *	  }
 */

    /** Draw horizontal line across from current cursor position */
    public static void horizLine (int length) {
        for (int i = 1 ; i <= length; i++) {
            System.out.print('\u00cf');  // decimal ascii 205
        }
    }


    /** Draw vertical line down, from current cursor position
     * cursor ends up below last segment of line
     */
    public static void vertLine (int Height) {
        for (int i = 1 ; i <= Height; i++) {
            System.out.print('\u006a');
            left(1);
            down(1);
        }
    }


    /* looks like it strips leading '\n's from the input */
/*    public static void flushLine() {
       char ch;
       while( (((int) (ch = cin.peek())) == 10) || (ch == 13))
         { ; }
    }
*/

    /* main() for testing only... to run: cd to parent directory and type:
	   java utils.TxtGrph
     */
    /* public */        // keep javadoc from showing this in pub. int'face
    public static void main(String[] args) {

        // testing getArrows();  s/b 0..4
        for (int i = 0; i < 10; i++)
            System.out.println (getArrows());



/*        homeAndClear();
        for (int i = 5; i < 8; i++) {
            for (int j = 8; j > 5; j--) {
                down(1);
                position(2 * i, 5 * j);
                System.out.print('x');
            }
        }
		affirmative ("how about that?? (y/n)");

		eraseAll();
		home();
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 75; j++)
				System.out.print('x');
			System.out.println();
		}

		position(5, 5);
		eraseRight();
		position(5, 5);
		horizLine(20);
		vertLine(10);
		prompt("how about that?");
		affirmative("testing new compile:");
*/
    }

} // end of class 