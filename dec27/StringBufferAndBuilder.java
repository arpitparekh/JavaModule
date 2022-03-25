package dec27;

public class StringBufferAndBuilder {

    public static void main(String[] args) {

        String name = "Tops";   // String immutable

//        name = "Hello";
        name.toLowerCase();
        name.toUpperCase();

        System.out.println(name);

        // to achieve mutability we have StringBuffer and StringBuilder

        StringBuffer name2 = new StringBuffer("Tops");

        name2.append(" Technology"); // "tops "

        System.out.println(name2);

        StringBuilder name3 = new StringBuilder("Tops");

        name3.append(" Technology"); // "tops "

        System.out.println(name3);


        // Thread //

    }
}
