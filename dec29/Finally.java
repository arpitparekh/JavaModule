package dec29;

public class Finally {

    public static void main(String[] args) {

        int x =23;

        try{

            System.out.println(x/0);

        }finally {

            System.out.println("bye bye");
        }

        System.out.println("code..........");


    }
}
