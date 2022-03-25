package dec24;

public class EmptyAndNull {

    public static void main(String[] args) {

        String name = null ;  // declare

        String name2 = "";   // empty is unique string with length zero

        System.out.println(name);
        System.out.println(name2);

        // isEmpty()   // isBlank()

        System.out.println(name2.isBlank());


    }
}
