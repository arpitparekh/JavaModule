package jan05;

import java.util.ArrayList;

class Fun{

    int x;
    float f;

    public Fun(int x, float f) {
        this.x = x;
        this.f = f;
    }

    @Override
    public String toString() {
        return
                "x = " + x +
                "\nf = " + f;
    }
}

public class ArrayListWithClassObject {

    public static void main(String[] args) {

        ArrayList<Fun> list = new ArrayList<>();

        list.add(new Fun(12,34.56f));
        list.add(new Fun(13,44.56f));
        list.add(new Fun(14,54.56f));
        list.add(new Fun(15,64.56f));
        list.add(new Fun(16,74.56f));

        System.out.println(list);

    }

}
