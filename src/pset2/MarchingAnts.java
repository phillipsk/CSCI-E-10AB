package pset2;

/**
 * @author Kevin Phillips
 * @since 10/19/2015
 * csci-e-10ab
 */
public class MarchingAnts {
    public static void main (String[] args)
    {
        verse (1, "suck his thumb.\n");
        verse (2, "tie his shoe, \n");
        verse (3, "climb a tree, \n");
        verse (4, "eat some gore! \n");
    }

    /**
     * Prints the verse of the song
     *
     * @param  n  The verse number currently to print
     */
    static void verse (int n, String s)
    {
        System.out.print ("The ants came marching " + n + " by " + n
                + ", hurrah!  Hurrah!\n"
                + "The ants came marching " + n + " by " + n
                + ", hurrah!  Hurrah!\n"
                + "The ants came marching " + n + " by " + n
                + ",\n" + "The little one stopped to " + s);
        chorus();
    }

    /**
     * Prints the chorus of the song
     */
    static void chorus ()
    {
        System.out.print ("And they all go marching down.\n"
                + "To the ground.  To get out of the rain!\n"
                +  "(Boom, boom, boom ... )\n\n");
    }
}
