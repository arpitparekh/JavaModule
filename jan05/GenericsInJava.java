package jan05;

class Data<T,V>{  // Generic class

    T x;
    V f;

    void setX(T x,V f){

        this.x = x;
        this.f=f;

    }

    void getX(){

        System.out.println("x is "+x+" and f is "+f);
    }


}

public class GenericsInJava {

    public static void main(String[] args) {

        // Generics // type safely
        Data<Integer,String> d = new Data<>();

        d.setX(12,"hello");
        d.getX();

    }
}
