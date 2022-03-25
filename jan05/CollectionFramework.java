package jan05;


import java.util.ArrayList;

class Student{

    int id;

    String name;

    float height;
}

public class CollectionFramework {

    public static void main(String[] args) {

        // collection
        Student s = new Student();


//        int arr[]={1,2,3,4,5};

        // ArrayList // dynamic array // advance array

        ArrayList<Integer> list = new ArrayList<>();



        list.add(12);
        list.add(34);
        list.add(56);
        list.add(65);

//        list.remove(0);
//        list.remove(0);

//        list.add(7,56);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(list);

        list2.set(0,111);


        list2.add(99);

        System.out.println(list2);
        System.out.println(list2.get(1));
        System.out.println(list2.indexOf(65));
        System.out.println(list);



//        int x =-34;

//        System.out.println(Math.abs(x));

    }
}
