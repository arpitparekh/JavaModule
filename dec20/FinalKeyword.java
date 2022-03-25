package dec20;

class Area{

    // final

    final int radius;    // initialize blank final variable from constructor
    float side;

    Area(int radius,int side){

        this.radius=radius;
        this.side=side;
    }
    Area(){
        this(12,45);
    }

    final protected void dance(){

        System.out.println("This is parent class method");

    }                                      // private < default < protected < public
}
class Circle extends Area{

//
//    @Override
//    public void dance() {
////        super.dance();
//        System.out.println("This is Child class method");
//    }
}

public class FinalKeyword {

    public static void main(String[] args) {

//        Area a = new Area(12,45);

            Circle c = new Circle();
            c.dance();
    }
}
