package dec22;

// Enumeration

// enumeration is a collection of constants

enum Day{

    // every constant in enum is static
    // every constant in enum is object

    MONDAY(1.4f),TUESDAY(2.1f),WEDNESDAY(3.4f),FRIDAY(6.8f),SUNDAY(0.1f) ;  // we can define string constant in enum

    float v;

    Day(float v){
        this.v=v;
    }
}

public class Enumeration {

    public static void main(String[] args) {

        System.out.println(Day.FRIDAY);

        for(Day day : Day.values()){

            System.out.println("value of "+day+" is ->"+day.v);

        }


    }
}
