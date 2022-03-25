package dec03;

public class Goa {

    private int x;

    private int y;

    private float f;

    // setter getter

    public  void setValue(int p,int q,float h){
        x=p;
        y=q;
        f=h;
    }

    public void display(){

        System.out.println(x);

        System.out.println(y);

        System.out.println(f);

    }
}


class Beach{

    public static void main(String[] args) {

        Goa g = new Goa();

        g.setValue(12,13,56.43f);

        g.display();


    }

}
