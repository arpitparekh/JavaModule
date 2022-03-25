package dec10;

public class Parent {

    void print(){

        System.out.println("This is Parent Class");
    }

}

class Child extends Parent{

    void print2(){

        System.out.println("This is Child class");
    }

    public static void main(String[] args) {

        Parent p= new Parent();
        p.print();
        Child c = new Child();
        c.print2();
        c.print();

    }
}



