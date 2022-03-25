package jan07;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollection {

    public static void main(String[] args) {

        // collection framework

        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(13);


//        System.out.println(list);

        // Hashing algo

        // we cannot store duplicate elements

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(18);
        hashSet.add(129);
//        hashSet.add(12);

        hashSet.addAll(list);

        System.out.println(hashSet);
    }
}
