/**
 * Created by Kevin Phillips on 8/24/15.
 * Case Study #1 from Building Java Programs
 */
public class Rocket {
    public static void main(String[] args){
        diamond();
        drawX();
        rocketSHIP();
//        System.out.println("New figure:");
//        coneUP();coneUP();rocketSHIP();drawX();rocketSHIP();coneUP();vDown();box();coneUP();vDown();drawX();rocketSHIP();
    }

    public static void diamond(){
        coneUP();
        vDown();
        System.out.println("");
    }

    public static void drawX(){
        vDown();
        coneUP();
        System.out.println("");
    }

    public static void rocketSHIP(){
        coneUP();
        box();
        boxUSlogo();
        box();
        coneUP();
        System.out.println();
    }

    public static void coneUP(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void vDown(){
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    public static void box(){
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }


    public static void boxUSlogo(){
        System.out.println("+------+");
        System.out.println("|UNITED|");
        System.out.println("|STATES|");
        System.out.println("+------+");
    }


}

