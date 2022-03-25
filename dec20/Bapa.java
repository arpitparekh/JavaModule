package dec20;

public class Bapa {   // outer class

    int strict_level;
    float length_belt;
    static int g;

    Bapa(){

        System.out.println("This is bapa Constructor");
    }

    static {

        System.out.println("This is static block");
    }




//    static class Chlid{                    // nested class // inner class
//
//        int age;
//        String name;
//
//    }

}

class Fun{

    public static void main(String[] args) {

        Bapa b = new Bapa();
    }
}


