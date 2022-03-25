package dec29;

import java.io.FileNotFoundException;
import java.sql.SQLException;

class A{

    void display() throws Exception{
        throw new SQLException();
    }
}
class B extends A{

    @Override
    void display() throws Exception {

        super.display();
    }
}
public class MethodOverridingException {

    public static void main(String[] args) throws Exception{

        B b = new B();

        b.display();
    }
}