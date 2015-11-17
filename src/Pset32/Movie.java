package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/16/2015
 */
public class Movie {
    // first instance variables
    //
    public int acting;
    private int directing;
    private int script;

    // 2 constructors
    Movie (int a, int d, int s)
    {
        acting = a;
        directing = d;
        script = s;
    }

    Movie ()
    {
        acting = 5;
        directing = 5;
        script = 5;
    }

    // now the instance method
    int rating ()
    {
        return  (acting + directing + script);
    }
}
