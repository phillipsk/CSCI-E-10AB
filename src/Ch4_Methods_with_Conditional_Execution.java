/**
 * Created by Kevin Phillips on 9/23/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter 4
 */
public class Ch4_Methods_with_Conditional_Execution {
    public static void main(String[] args) {
        String s = "four score and seven years ago";
/*        int r = s.indexOf('r');
        int v = s.indexOf('v');

        System.out.println(r +" "+ v);*/

        indexing(s,'v');
    }

    public static int indexing(String a, char b){
        int s = 0;
        int counter = 0;
        int ch = 0;
        for (int i = 0;i < a.length();i++){
            if (a.charAt(i) == b){
                System.out.println("The index of character: "+b+" is at index location: " +i+
                        "\n and the counter position is at: "+counter);
                return (i);
            }
            counter++;
        }
// no else statement needed, this is a shorter conventional way of writing a for statement
        return(-1);
    }
}
