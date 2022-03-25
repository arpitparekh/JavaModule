package dec15;

class A{

    int x;
    int y;

    void printSum(){
        System.out.println("Sum is ->"+(x+y));
    }
}
interface I{
    void assignValues(int p,int q);
    void findAverage();
}
interface I2{
    void powerOfSum();
}

class B extends A implements I,I2{  // multiple inheritance

    @Override
    public void assignValues(int p, int q) {
        x=p;
        y=q;
    }

    @Override
    public void findAverage() {
        System.out.println((x+y)/2);
    }


    @Override
    public void powerOfSum() {
        System.out.println(Math.pow(x+y,3));
    }
}

// interface


public class MultipleInheritance {

    public static void main(String[] args) {

        B b = new B();

        b.assignValues(12,13);  // method from interface

        b.printSum();

        b.findAverage();

        b.powerOfSum();
    }
}
