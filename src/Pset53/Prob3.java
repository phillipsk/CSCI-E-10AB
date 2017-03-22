package Pset53;

import java.util.ArrayList;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/16/17
 */

/*
Suppose we have constructed an ArrayList of String values, named a. For
example, a might contain just 3 values, and the output by executing the statement
System.out.println (a) ; could look like this
[Now, Later, Ever]
Consider now the following incorrect loop which is supposed to add the string “NOT” in front of each word
in the ArrayList:
for (int i = 0; i < a.size(); i++)  a.add (i, "NOT");

If this loop worked correctly, then the output by executing a System.out.println (a); would be
[NOT, Now, NOT, Later, NOT, Ever]

What is a very simple way of fixing the loop so that it works correctly?
*/
public class Prob3 {

    public static void main(String[] args) {
        printNotList();
    }

    public static void printNotList() {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Now");
        a.add("Later");
        a.add("Ever");

        for (int i = 0; i < a.size(); i+=2) // increment the counter by 2 everytime
            a.add(i, "NOT");
        System.out.println(a);
    }
}
