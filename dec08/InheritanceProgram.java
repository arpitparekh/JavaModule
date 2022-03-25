package dec08;

class Area{

    int radius ;  // 23
    int height,width;
    int side;

}
class Circle extends Area{

    void insertRadius(int x){
        radius = x;
    }

    void findCircleArea(){
        System.out.println(3.14*radius*radius);
    }

}
class Rectangle extends Area{


    void findRectangleArea(){
        System.out.println(height*width);
    }

}

class Square extends Area{
    void squareArea(){
        System.out.println(side*side);
    }
}



public class InheritanceProgram {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.insertRadius(20);

        c.findCircleArea();


    }
}
