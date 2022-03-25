package dec06;

public class FunctionDemo {

    // function

    // user defined

    // pre-defined  // main // pow() // sqrt() // cbrt()

    // function name
    // function body
    // function parameter // argument
    // return type

    void maruFunction(){  // no returnType // no parameter

        System.out.println("hello this is meraFunction");

    }

    // parameter // argument // the value that we give to function from outside

    // function // function is a block of block that runs when wew calls it

    void sum(int x,int y){    // function declaration
        // int x =12;
        // int y =13;

        System.out.println(x+y);

    }

    void display(int x,float f,double d,String name){

        System.out.println(x);
        System.out.println(f);
        System.out.println(d);
        System.out.println(name);

    }

    int jo(){ // with return type // no parameter

        return 456;
    }

    int mul(int c,int d){ // with parameter and with return type
        return c*d;
    }

    public static void main(String[] args) {  // function == method

        FunctionDemo d = new FunctionDemo();

        d.maruFunction();

        d.sum(12,13);   // function call
        d.sum(10,20);
        d.sum(30,40);

        d.display(12,34.56f,343.34,"tops");

        int j = d.jo();

        System.out.println(j);

        System.out.println(d.mul(10,20));


    }



}
