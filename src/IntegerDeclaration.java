/**
 * Created by Kevin Phillips on 8/25/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach.
 * Chapter 2.2
 */
public class IntegerDeclaration {
    public static void main(String[] args) {
        double y = 2 +3; // promoting y to a type which is unnecessary, i.e. y only requires type int
//        System.out.println(y);

//        casting variable type
        int totalQuestions = 73, numRight = 59; double percent;

//        this calculation produces ZERO unless we cast one of the variables as a double to bypass the integer division
        percent = numRight / totalQuestions * 100;
        System.out.println(percent);

        percent = (double) numRight / totalQuestions * 100;
        System.out.println(percent);
    }
}
