package dec13;

abstract class Shape{

    String color;

    void dance(){

        System.out.println("This is dance method");
    }

    abstract void getArea();

}

class Rectangle extends Shape{

    int length,width;

    Rectangle(int a,int b){
        length = a;
        width = b;
    }

    @Override
    void getArea() {
        System.out.println(length*width);
    }
}

class Triangle extends Shape{
    int base,height;

    Triangle(int a,int b){

        base = a;
        height = b;
    }
    @Override
    void getArea() {
        System.out.println(0.5*base*height);
    }
}

public class AbstractExample {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(12,13);
        r.dance();
        r.getArea();

        Triangle t = new Triangle(12,13);
        t.getArea();


    }
}
