package nov22;

public class OperatorInJavaClass {


    public static void main(String[] args) {

       // operators

         // arithmetic operator

        // + - / * %

        int g = 100%6 ;  // returns the reminder

        // conditional operator

        //  < > <= >= ==  !=

        // assignment operator

        //   =   += -+ /= *= %=

        int x = 23;

        int z = 10;

        z  %= 20;  // z = 10%20 ;

        System.out.println(z);

        // logical operator

        //     &&  ||

        boolean b3 = 12<23 && 13<12;

        /*
        &&
        1  1  = 1
        1  0  = 0
        0  1  = 0
        0  0  = 0

         */

        boolean b4  = 12<34 || 23<1;

        /*

        ||

        1   1 = 1
        1   0 = 1
        0   1 = 1
        0   0 = 0
         */


        // bit shift operator

        //       <<  >>

        int i =45;

        int h = i>>2;

        System.out.println(h);

        // ternary operator

        //    ?    :

    }
}
