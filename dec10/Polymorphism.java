package dec10;

class C{

    void display(int x,int y){

    }
}

public class Polymorphism {

    // poly == many  .. morphism == forms

    // more than one form

    // method overloading // method overriding

    // method overloading

    // all method should be in same class
    // name of the methods are name
    //  but the parameters are different // parameter order should be different
    // no of parameter should be different

    int x =23;

    void display(int x,int y){

    }
//    int display(int x,int y){
//
//        return 23;
//    }
    void display(float f,float f1){

    }
    void display(int x){

    }
    void display(String name,int x){

    }
    void display(int x,String name){

    }



    public static void main(String[] args) {

        Polymorphism p = new Polymorphism();

       p.display(23);

    }
}
