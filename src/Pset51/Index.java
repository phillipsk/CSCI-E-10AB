package Pset51;

public class Index {

    /**
     * Harvard Extension School Programming Certificate
     * CSCI E-10B Introduction to Computer Science Using Java II
     * Professor Dr. Henry Leitner
     * Teaching Assistant Brandon Tineo
     * Received help from Codementor.io Dharmendra Prasad
     *
     * @author Kevin Phillips
     * @since 2/10/17
     */

    /**
Write a recursive method named indexOf that accepts two Strings as
parameters and returns the starting index of the first occurrence of the second
String inside the first String (or -1 if not found). For example, the call of
indexOf (“Barack Obama”, “bam”) would return 8.

Note that Strings already have an indexOf method, but you may not use it in
your solution!

     * @param a The first, original string
     * @param b The second string which indexOf will identify a possible match beginning perhaps somewhere within a,
     *          the original string
     * @return  The index character position (index beginning at 0) of the second string
     */

    public static int indexOf(String a, String b) {
        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            // if either is unspecified or empty return no match found
            return -1;
        }

        int index = -1;
        if (a.charAt(0) == b.charAt(0) && b.length() == 1) {
            // if first characters match and b is a single character
            // this is a complete match
            return 0;
        }

        for (int i=0; i<a.length(); i++) {
            // iterate over string a until we find a match for first character of b
            if (a.charAt(i) == b.charAt(0)) {
                // this is the final index to be returned
                index = i;
                if (b.length() == 1 || a.length() > 1 && indexOf(a.substring(index+1), b.substring(1)) == 0) {
                    // if a and b have more characters
                    // and further match was found for remaining characters in b
                    return index;
                }
            }
        }
        if (index == -1) {
            // no match found for b in a
            return -1;
        }

        // comparing rest of the characters of b resulted in no match
        // hence return b not found in a
        return -1;
    }

    public static void main(String[] args) {

        System.out.print("The first occurrence of the second string " + "\"bam\"" +" within the original string " +
                "\"Barack obama\"" + " is at string character position: ");
        System.out.println(indexOf("Barack obama", "bam"));

        System.out.print("The first occurrence of the second string " + "\"arm\"" +" within the original string " +
                "\"Barack obarma\"" + " is at string character position: ");
        System.out.println(indexOf("Barack obarma", "arm"));

        System.out.print("The first occurrence of the second string " + "\"arm\"" +" within the original string " +
                "\"Barack obama\"" + " is at string character position: ");
        System.out.println(indexOf("Barack obama", "arm"));
    }
}
