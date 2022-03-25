package dec15;

abstract class Student{

    // we can include abstract properties in abstract class

    int p ;
    int q ;

     void fun(int x,int y){

         p=x;
         q=y;
    }
    abstract void display();
}

class Register extends Student{

    @Override
    void display() {
        System.out.println(p);
        System.out.println(q);
    }
}




public class AbstractionRevisionClass {

    public static void main(String[] args) {

        Register r = new Register();

        r.fun(12,13);

        r.display(); // overridden method

    }
}
