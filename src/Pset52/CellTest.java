package Pset52;
/*
    Consider the following classes:
    public class Cell { … }
    public class BloodCell extends Cell { … }
    public class RedBloodCell extends BloodCell { … }
    Spring, 2017 Dr. H. H. Leitner
    Computer Science E-10b: Introduction to Computer Science Using Java, II Page 2
    Which of the following assignments are valid? In a clear and concise
    sentence, explain why the illegal ones are invalid.

✦       Cell c = new BloodCell();
✦       Cell c = new RedBloodCell();
✦       BloodCell c = new RedBloodCell();
✦       RedBloodCell c = new BloodCell();
* */


public class CellTest {

    Cell cA = new BloodCell();
    Cell cB = new RedBloodCell();
    BloodCell cC = new RedBloodCell();


    /*

    This Constructor fails as the object type defined on the LHS is a different object type of the object that is trying to be
    instantiated on the RHS via the new keyword.

    RedBloodCell cD = new BloodCell();

   The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory. The new operator also invokes the object constructor.
   Note: The phrase "instantiating a class" means the same thing as "creating an object." When you create an object, you are creating an "instance" of a class, therefore "instantiating" a class.



*/
}
