package pset2;

/**
 * @author Kevin Phillips
 * @since 10/19/2015
 * csci-e-10ab
 */

public class ThisOldMan {
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

    public static void verse(int n, String s){
        /*  This old man, he played 1.
            He played nick-nack on my drum;
            With a nick-nack paddy-whack, give the dog a bone,
            This old man came running home.

            This old man, he played 2.
            He played nick-nack on my shoe;
            With a nick-nack paddy-whack, give the dog a bone,
            This old man came running home. */

        System.out.print("This old man, he played " + n +". \n"+
            "He played nick-nack " + s + ";\n" +
            "With a nick-nack paddy-whack, give the dog a bone,\n" +
            "This old man came running home.\n");
//            "This old man, he played 2." +
//            "He played nick-nack on my shoe;");

    }
}
