package FinalExamReview10a;

class Bicycle    // think of this as a "template" or "blueprint" for constructing
{                // actual bicycle objects 

    // first, 3 instance variables (STATE)
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // now, define 5 instance methods (BEHAVIOR)
    void changeCadence (int newValue)
    {
        cadence = newValue;
    }

    void changeGear (int newValue)
    {
        gear = newValue;
    }

    void speedUp (int increment)
    {
        speed += increment;
    }

    void applyBrakes (int decrement)
    {
        speed -= decrement;
    }

    void printStates (String name)
    {
        System.out.println(name + ":  cadence:" +
                cadence + " rpm, speed:" +
                speed + " mph, gear:" + gear);
    }

    public static void main(String[] args){
                // Create two different
                // Bicycle objects
                Bicycle bike1 = new Bicycle();
                Bicycle bike2 = new Bicycle();

                // Invoke methods on
                // those objects
                bike1.changeCadence (50);
                bike1.speedUp (10);
                bike1.changeGear (2);
                bike1.printStates("Old Schwinn");

                bike2.changeCadence (50);
                bike2.speedUp (10);
                bike2.changeGear (2);
                bike2.changeCadence (40);
                bike2.speedUp (10);
                bike2.changeGear (3);
                bike2.printStates("Mountain bike");
    }
}