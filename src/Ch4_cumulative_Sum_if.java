import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Kevin Phillips on 9/20/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter
 */
public class Ch4_cumulative_Sum_if {
    public static void main(String[] args) {
//        examineNumbers();
        tutorials_Point();

    }

    public static void examineNumbers(){
        give_Intro();

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the total value:");
        int totalnumbers = console.nextInt();
//        int validation_INT = console.hasNextDouble()
        /*if (validation_INT = int){

        }*/
//        double totalnumbers = console.nextDouble();
        double sum = 0;

        for (int i = 1; i <= totalnumbers; i++){
            System.out.println("    #" + i + " = ");
            double next = console.nextDouble();
            sum += next;
        }
//        check sum value
//        System.out.println(sum);

//      first attempt (works)
/*        double average = sum / totalnumbers;
        System.out.println(average);*/

//        second attempt (works) but I cast to an integer to return a integer average
        System.out.println("The average = " + (int) sum / totalnumbers);

    }

    public static void give_Intro(){
        System.out.print("This program examines a sequence \n" +
                "of numbers to find the average \n" +
                "and count how many are negative. \n \n");
    }


    public static void tutorials_Point(){
    String s = "Hello World! 3 + 3.0 = 6 ";
    double d = 1.3985;
    s=s+d;

    // create a new scanner with the specified String Object
    Scanner scanner = new Scanner(s);

    // assign locale as US to recognize double numbers in a string
//    scanner.useLocale(Locale.US);

//        end TutorialsPoint BEGIN My code

//        New regex package or split methods supersede legacy Tokenizer class (further below)
//        http://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
        String[] result = s.split("\\s");
        System.out.println(s.length());
        for (int x=0; x<result.length; x++)
            System.out.println(result[x]);

/*        String[] result = s.split("\\s");
        System.out.println(s.length());
        System.out.println(result.length());

        for (int i = 0; i < result.length(); i++){
            System.out.println(result[i]);
        }*/



        while (scanner.hasNext()) {
        // print what is scanned
//        String currentValue = scanner.next();

//          this legacy class is deprecated
/*        StringTokenizer count_Tokens = new StringTokenizer(scanner.next());
        System.out.println(count_Tokens);*/

//        received bad data via print of StringTokenizer class
/*        for (int i = 1; i <= count_Tokens; i++){

        }*/

/*        Double doubleValue = Double.valueOf(currentValue);

        if (doubleValue == Double.valueOf(currentValue)){


        }*

//        Successful method below, I personally wanted to avoid try statements

/*        System.out.println("Checking whether " + currentValue + " is of type 'double' ...");
        boolean isDouble = false;
        try {
            Double doubleValue = Double.valueOf(currentValue);
            isDouble = true;
            System.out.println(doubleValue + " : " + isDouble);
        } catch(NumberFormatException ex) {
            System.out.println(currentValue + " : " + isDouble);
        }
*/

        // check if the scanner's next token is a double
//        System.out.println("" + scanner.hasNextDouble());

    }

    // close the scanner
    scanner.close();
}


}
