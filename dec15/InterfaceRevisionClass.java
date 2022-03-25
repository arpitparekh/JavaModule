package dec15;

import java.util.Scanner;

interface Area{

    // interface is a collection of abstract methods // pure abstraction

    void findArea();  // abstract method
}

class Circle implements Area{


    @Override
    public void findArea() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int radius = sc.nextInt();

        System.out.println("area of a circle is -> "+(3.14*radius*radius));

    }
}
public class InterfaceRevisionClass {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.findArea();
    }
}
