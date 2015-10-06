/**
 * Created by Kevin Phillips on 9/28/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter
 */
public class Pset2_HW {
//    public static final int HEIGHT = 5;

    public static void main(String[] args) {
/*        int x = 2;
        System.out.println("foo (x,3) = "+ foo(x,3));
        System.out.println("foo (x,4) = "+ foo(x, 4));
        System.out.println("bar (-x) = "+ bar(-x));
        System.out.println("bar (foo (x+x, ++x) ) = "+ bar(foo(x+x,++x) ));
        System.out.println("Final value of x = " + x);*/
    for (int outer = 2; outer <= 6; outer++){
        for (int inner =1; inner <=8; inner++){
            System.out.print("");
        }
        System.out.println();
    }

    }



    static int foo(int a, int b){
        return (a+b);
    }

    static int bar(int x){
        x += 2;
        return (x*x);
    }

}
