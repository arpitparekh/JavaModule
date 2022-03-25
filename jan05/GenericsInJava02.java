package jan05;

class H{


    <T,V>void study(T a,V b){

        System.out.println(a);
        System.out.println(b);
    }
}

public class GenericsInJava02 {

    public static void main(String[] args) {

        H h=new H();

        h.study(false,"hello");

    }
}
