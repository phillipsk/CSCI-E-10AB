package FinalExamReview10a;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/21/15
 */
public class BaseballPlayer {

    private String name;
    private int yearOfBirth;
    private int atBats;
    private int singles, doubles, triples, homeruns;

    public double battingAvg(){
//      return (singles + doubles + triples + homeruns) / atBats;
        return (double) (singles + doubles + triples + homeruns) / atBats;
    }

//  public void BaseballPlayer(String name, int yob){
    public  BaseballPlayer(String name, int yob){
//        name = name;
        this.name = name;
        yearOfBirth = yob;
    }

    public void atBat(int hitType){
        switch (hitType){
            case 0: break;
            case 1: singles++;
                break;
            case 2: doubles++;
                break;
            case 3: triples++;
                break;
            case 4: homeruns++;
                break;
                default: System.out.println("Bad arg -- " + hitType +
                " -- passed to method atBat!!");
                    return;
        }
        atBats++;
    }


    public static void main(String[] args) {
        BaseballPlayer ortiz = new BaseballPlayer("Ortiz, David", 1975);
        ortiz.atBat(1);
        ortiz.atBat(4);
//        ortiz.atBat(5);
        ortiz.atBat(0);

        System.out.println(ortiz.name + " batting average is ... " + ortiz.battingAvg());
    }
}