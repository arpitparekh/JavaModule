package dec13;

abstract class Employee{

    // abstract class is in-complete class

    // we can not create abject of abstract class

    // we  compulsory have to extend the abstract class

    int x ;
    String name;

    void display(){


    }
    // we cal also create abstract members in abstract class

    abstract void print(int x);

    // abstract method is the method without any body

    // we must have to override abstract method

}

class Worker extends Employee{

    @Override
    void print(int x) {   // abstract class provide implementation to the other class

    }

    @Override
    void display() {
        super.display();
    }
}


public class Abstraction {

    // oopc

    // class  // object // inheritance // encapsulation

    // Abstraction

    // existing in thought or as an idea but not having a physical or concrete existence.

    // Abstract class  // interface
}
