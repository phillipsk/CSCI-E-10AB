package Pset52.barcode

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Codementor.io Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/7/17
 */
class BarCodeTestTT extends GroovyTestCase {

    static void main(String[] args){
        String[] tester = { "02138"
            "||:|:::|:|:||::::::||:|::|:::|||"
            "||:::||::|:::|:|:|::|||:::|:|::|"
            "||:::||::|:::|:|:|::|||:::||:::|"
            "||:::||::|:::|:|:|::|||:::||:::|"
            "||:|:::|:|:||::::::||:|::|:::||:"
            "0231a" }
        for (String aTester : tester) {
            System.out.println()
            try {
                System.out.println("Creating bar code with " + aTester)
                BarCode bc = new BarCode(aTester)
                System.out.println("\tCode created!   ")
                System.out.println("\tBar code is : " + bc.getBarCode() + ";  zip is : " + bc.getZipCode())
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage())
            }
            System.out.println()
        }


        String sss = new String("hello there joshua how are you")
        BarCode bc_bc = new BarCode(sss)



    }

    protected String Mtester(BarCode param){

        if (param instanceof String) {
            testGetBarCode(param)

            return param.getBarCode()

        } else if (param instanceof Integer) {
            testGetZipCode(param)
            return param.getZipCode()
        } else (Objects.equals(param, ""){

        })

    }


    void setUp() {
        super.setUp()
        BarCode ffg = new BarCode("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")
        testGetZipCode(ffg)
        testGetBarCode(ffg)
        BarCode num = new BarCode('02110')
        testGetZipCode(num)
        testGetBarCode(num)


    }

    void tearDown() {

    }

    void testGetZipCode(BarCode abc) {
        System.out.println(abc.getZipCode())
    }

    void testGetBarCode(BarCode abce) {
        System.out.println(abc.getBarCode())
    }

}
