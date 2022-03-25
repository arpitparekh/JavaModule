package dec20;

class Market{

    // static

    static int count;         // becomes a part of class rather than part of object
    String itemName;

    static void display(int x){
        System.out.println(x);
    }
}

public class StaticKeyword {

    public static void main(String[] args) {

//        Market m = new Market();
        Market.count = 56;
        System.out.println(Market.count);     // we can access static variable using class name

        Market.display(23);

//        m.count = 23;
//        m.itemName="pen";
//
//        Market m2 = new Market();
//
//        m2.itemName="fog";
//
//        m2.count=55;
//        System.out.println(m2.count);
//        System.out.println(m.count);
    }
}
