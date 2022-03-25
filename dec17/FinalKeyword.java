package dec17;

class Goa{   // we cannot extend final class

    // final keyword

    final int x ;   // we can not change the value of final properties

    Goa(int x) {     // we must have to initialize blank final variable using constructor
        this.x = x;
    }

    final void display(){    // we cannot override final method
        System.out.println("This is display function");
    }

}
//class Church extends Goa{
////    Church() {
////        super(x);
////    }

//    @Override
//    void display() {
//        super.display();
//    }
//}


//class Panji extends Goa{
//
//
//}


public class FinalKeyword {

    public static void main(String[] args) {

        Goa g = new Goa(23);

//        g.x=45;

        System.out.println(g.x);

    }
}
