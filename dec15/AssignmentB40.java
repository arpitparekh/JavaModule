package dec15;

class RectangleNew{   // pending...................

    int length;
    int breadth;

    RectangleNew(){
        System.out.println("Rectangle New Class Constructor");
    }  // default constructor

    RectangleNew(int a,int b){  // parameterized constructor

        length=a;
        breadth=b;
    }

    void area(){
        System.out.println(length*breadth);
    }

    void perimeter(){

        System.out.println(2*(length+breadth));
    }
}

class Square extends RectangleNew{

}

public class AssignmentB40 {
    public static void main(String[] args) {

        Square s = new Square();
    }
}
