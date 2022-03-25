package dec24;

import java.util.Arrays;

public class StringRevision {

    public static void main(String[] args) {

        String name = "tops";     // string template  // String is a character array

        String data = "tops";

        // String Functions

        // charAt

        System.out.println(name.charAt(1));

        // length

        System.out.println(name.length());

        // copy

        String name2;

        name2 = name;

        // getChars

        char arr[]=new char[name.length()];

        name.getChars(0,name.length(),arr,0);

        System.out.println(Arrays.toString(arr));

        // getBytes

        byte arr2[]=new byte[name.length()];

        arr2=name.getBytes();

        System.out.println(Arrays.toString(arr2));

        // equalsIgnoreCase()

        String s1 = "tops";
        String s2 = "Tops";

        System.out.println(s1.equalsIgnoreCase(s2));

        // subString

        String s3 = "Hello Students";

        String s4;

        s4 = s3.substring(3,10);

        System.out.println(s4);

        // concat()

        String f1 = "Hello ";
        String f2 = "Students";

        String f3;

        f3=f1.concat(f2);

        System.out.println(f3);

        // replace()

        String g1 = "oo bhai";


        String g2;

        g2 =g1.replace('o','e');

        System.out.println(g2);

        // split()

        String n1 = "hello How R U ?";
        String arrS[];
        arrS = n1.split("//s");
        System.out.println(Arrays.toString(arrS));

        // toLowerCase() // toUpperCase

        String m1 = "HELLO People";
        String m2;

        m2 = m1.toLowerCase();

        System.out.println(m2);

        // trim()

        String k1 ="           tops       ";

        String k2;
        k2=k1.trim();
        System.out.println(k2);

        // intern()

        String b1 = "tops";                      // String templates // String pool
        String b2 = new String("tops").intern();   // heap

        System.out.println(b1==b2);

        // toCharArray()

        String z = "Hello";

        char arrC[]=z.toCharArray();

        System.out.println(Arrays.toString(arrC));

        // valueOf

//        String l="hellooo";

        int x =4535445;

        String j = String.valueOf(x);

        System.out.println(j);

        // compareTo

        String y1 ="tops";
        String y2 ="toXP";

        System.out.println(y1.compareTo(y2));   // 0

        //endWith()

        System.out.println(y1.endsWith("y"));

    }
}
