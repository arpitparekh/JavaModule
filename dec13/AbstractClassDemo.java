package dec13;

abstract class A{

    abstract void hello();
}
abstract class B extends A{

    @Override
    void hello() {

    }

    abstract void hi();
}

class H extends B{

    @Override
    void hi() {

    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {


    }
}
