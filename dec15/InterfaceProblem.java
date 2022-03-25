package dec15;

interface A1{
    void print();
}
interface A2{
    void print();
}
interface A3 extends A2,A1{

    // class // object // inheritance // abstraction (abstract class & interface) // Encapsulation
    // polymorphism(method overloading // method overriding)

}

class B1 implements A3{


    @Override
    public void print() {

    }
}

public class InterfaceProblem {

    public static void main(String[] args) {

    }
}
