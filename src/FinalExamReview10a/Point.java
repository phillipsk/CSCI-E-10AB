package FinalExamReview10a; /** Point.java
 *  Defines the class Point
 *     Dr. Henry H. Leitner
 *     Last Modified November 23, 2015
 */
import java.util.*;

public class Point
{
    private double  x, y;   // data members

    public Point()          // constructors
    {
        x = 0;
        y = 0;
    }

    public Point (double xcoord, double ycoord)
    {
        x = xcoord;
        y = ycoord;
    }

    public double getX() {return x; }  // selector fns.

    public double getY() {return y; }

    public void setX(double value)
    {
        x = value;
    }

    public void setY(double value)
    {
        y = value;
    }

    public void input()     // keyboard input 
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.print ("  X COORDINATE: ");
        x = keyboard.nextDouble();
        System.out.print ("  Y COORDINATE: ");
        y = keyboard.nextDouble();
    }

    public Point midpoint (Point p2)
    {   return new Point ( (x+p2.x)/2, (y+p2.y)/2 ); }

    public String toString()
    {   return "("+ getX() + ", " + getY() + ")"; }

//    ** for testing
     public static void main (String[] args)
     {
     Point p1 = new Point (1, 5);
     Point p2 = new Point (3, 7);
     Point p3 = new Point();
     p3.input();
     System.out.println ("p3 is " + p3);
     System.out.println
     ("midpt of p1, p2: " + p1.midpoint(p2));
     }

}