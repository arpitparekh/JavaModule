package dec10;

public class Area {

    void findArea(int length , int breadth){

        System.out.println(length*breadth);
    }
    void findArea(int side){

        System.out.println(side*side);

    }

    public static void main(String[] args) {

        Area a = new Area();

        a.findArea(12,23);
        a.findArea(45);

    }

}
