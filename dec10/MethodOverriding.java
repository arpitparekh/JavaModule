package dec10;

class A{  // parent

    // access modifier  // public // protected // default // private

    protected int x =23;

    void display(int x,int y){
        System.out.println(x+y);
    }
    void fun(int x){

        System.out.println(x);
    }
}

class B extends A{  // child

    @Override
    protected void display(int x,int y){

        System.out.println(x-y);
    }

    void display(int x,int y,int z){

    }

    @Override
    void fun(int x) {
        System.out.println(x+10);
    }
}

public class MethodOverriding {

    // method overriding
    // methods name should same
    // method parameter should be same
    // inheritance should be there

     // access should be broad in method overriding

    public static void main(String[] args) {

        B b = new B();

        b.display(12,12);

        A a = new A();

        a.display(12,12);


    }
}
