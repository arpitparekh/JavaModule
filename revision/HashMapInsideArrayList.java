package revision;

import java.util.ArrayList;
import java.util.HashMap;

class A{// inner class


    static class B{

        int c;

    }

    int a;
    int b;

    A(){

    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

public class HashMapInsideArrayList {

    public static void main(String[] args) {

        ArrayList<HashMap<String,String>> list = new ArrayList<>();

        HashMap<String,String> map1 = new HashMap<>();
        map1.put("age","23");
        map1.put("height","67");
        map1.put("name","patil");

        list.add(map1);

        HashMap<String,String> map2 = new HashMap<>();
        map2.put("age","53");
        map2.put("height","117");
        map2.put("name","nimal");

        list.add(map2);

        System.out.println(list);

        A a = new A();
        A.B b = new A.B();

        b.c =23;

        System.out.println(b.c);

    }
}
