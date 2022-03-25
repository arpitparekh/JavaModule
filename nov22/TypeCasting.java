package nov22;

public class TypeCasting {


    public static void main(String[] args) {

        int x =23;   // 4 byte

        long l =  x ;  // 8 byte

        byte b = 1;

        short s =b;

        //type casting

        // 2 types of type casting

        // upward casting  // widening type

        // downward casting

        System.out.println(x);

        // downward cast  // narrowing type

        //data can be lost in downward type casting

        long l1  = 1828282828 ;

        int i = (int) l1 ;

        System.out.println(i);

        double d = 34454344.3434343434;  // 101001011010101.0101010101

        float f2 = (float) d;

        System.out.println(f2);


    }
}
