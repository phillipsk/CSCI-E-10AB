package pset2;

/**
 * @author Kevin Phillips
 * @since 10/19/2015
 * csci-e-10ab
 */

public class ThisOldMan {
    /** Main contains the 10 integer-string verse pairs.
     */
    public static void main(String[] args) {
        verse(1,"on my drum");
        verse(2,"on my shoe");
        verse(3,"on my tree");
        verse(4,"on my door");
        verse(5,"on my hive");
        verse(6,"on my sticks");
        verse(7,"up in heaven");
        verse(8,"on my gate");
        verse(9,"on my spine");
        verse(10,"on my hen");
    }

    /**
     * This method concatenates the following two parameters to print the nursery rhyme "This Old Man"
     *  These parameters are listed in the main method.
     * @param n passed by main, corresponds to the related integer within the verse
     * @param s passed by main, corresponds to the related string within the verse
     */
    public static void verse(int n, String s){
        System.out.print("This old man, he played " + n +". \n"+
            "He played nick-nack " + s + ";\n" +
            "With a nick-nack paddy-whack, give the dog a bone,\n" +
            "This old man came running home.\n");
    }
}
