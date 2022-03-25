package dec22;

public class StringClass {
    public static void main(String[] args) {

        // String pool

        String s1 = "tops";     // string literals
        String s2 = "tops";

        String s3 = "tech";

        // ==  ->  compare memory location
        // .equals  -> compare contents of objects

        String s4 = new String("tops");   // string objects
        String s5 = new String("tops");

        String s6 = new String("tech");

        System.out.println(s1==s2);  // true
        System.out.println(s1==s3);  // false

        System.out.println(s1==s4); // false
        System.out.println(s4==s5); //  false
        System.out.println(s4.equals(s5));  // true

        System.out.println(s3==s6);  // false

    }


}
