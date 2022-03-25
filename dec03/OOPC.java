package dec03;

public class OOPC {

    // class is blueprint and template that holds the properties and methods

    // object is an instance of a class

    int x;

    float f;

    double d;

    OOPC(){   // default constructor

        System.out.println("This is Default Constructor");
    }

    OOPC(int x1,float f1,double d1){   // Parametrized Constructor // setter constructor

        x=x1;
        f=f1;
        d=d1;
    }

    public static void main(String[] args) {

        ///////    OOPC   //////

        // object-oriented  Programming concepts

        OOPC c = new OOPC(12,1234.34f,34343.333);

        System.out.println(c.d);
    }
}
