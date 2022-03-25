package jan07;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCollection {

    public static void main(String[] args) {


        ArrayList<Integer> list =  new ArrayList<>();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(99);
        list.add(101);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){

            System.out.println(iterator.next());
        }

    }
}
