package dec13;

interface Daman{

    void jalsa();
}

interface Goa extends Daman {

    void party();
}

abstract class Vacation implements Goa{

    abstract void fun();
}

class C1 extends Vacation{

    @Override
    public void jalsa() {

    }

    @Override
    public void party() {

    }

    @Override
    void fun() {

    }
}

public class AbstractInterfaceDemo1 {

    public static void main(String[] args) {


    }
}
