package Pset51;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 *
 * @author Kevin Phillips
 * @since 2/8/17
 *
 * Received help from CodeMentor Dharmendra Prasad
 */
public class Enum {

        enum Months { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG,
            SEP, OCT, NOV, DEC} ;

        public static int daysInMonth(Months m, int year){
            switch (m){
                case JAN:
                case MAR:
                case MAY:
                case JUL:
                case AUG:
                case OCT:
                case DEC:
                    return 31;
                case FEB:
                    if (year % 4 == 0 && year % 100 != 0)
                        return 29;
                    if (year % 400 == 0)
                        return 29;
                    return 28;
                case APR:
                case JUN:
                case SEP:
                case NOV:
                    return 30;
            }
            return 0;
        }

        public static void main(String[] args){
            for (Months m : Months.values() ) {
                System.out.println (m + " 2017 has " +
                        daysInMonth(m, 2017) + " days!");
            }
        }

}
