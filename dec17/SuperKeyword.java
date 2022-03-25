package dec17;

class A{

    int x;
    String name;

    // super keyword refers to the parent class object

    A(){

        System.out.println("This is Parent Class Constructor");

    }
    void display()
    {
        System.out.println("This is Parent Class Method");
    }
}

class B extends A{

    void assign(int x,String name){

        super.x = x;                      // access parent class properties
        super.name=name;
    }

    B(){
        super();  // must have to be first statement    // access parent class constructor
        System.out.println("This is B Class Constructor");
    }

    void print(){
        super.display();                // access parent class method
    }

}

public class SuperKeyword {

    public static void main(String[] args) {

    }
}
