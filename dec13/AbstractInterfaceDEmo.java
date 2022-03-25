package dec13;

interface MyInterface{

    void fun();

    void dance();

}

// it is not always compulsory to override abstract method from interface to abstract class


abstract class Vehicle implements MyInterface{

    String color;
    float speed;


    void running(){  // concrete methods

    }

    abstract void goingDirection();   // abstract method

}

class Car extends Vehicle{

    @Override
    public void fun() {

    }

    @Override
    public void dance() {

    }

    @Override
    void goingDirection() {

    }
}


public class AbstractInterfaceDEmo {


    public static void main(String[] args) {


    }
}
