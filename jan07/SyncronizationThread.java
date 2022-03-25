package jan07;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class SyncronizationThread {
    public static void main(String[] args) {

        Vector<Integer> list =  new Vector<>();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(99);
        list.add(101);

        new Thread(new Runnable() {
            @Override
            public void run() {
                list.add(45);

                System.out.println(list);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                list.remove(3);

                System.out.println(list);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                list.add(23);

                System.out.println(list);
            }
        }).start();

        Enumeration<Integer> enumeration = list.elements();

        while (enumeration.hasMoreElements()){

            System.out.println(enumeration.nextElement());
        }

    }
}
