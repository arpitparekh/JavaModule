package jan07;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckDuplicteData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list =  new ArrayList<>();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(99);
        list.add(101);

        System.out.println("old list "+list);

        System.out.println("Enter Number");

        Integer h = sc.nextInt();

        if(list.contains(h)){
            System.out.println("Element is already in list");
        }else{
            list.add(h);
        }

        System.out.println(list);

    }
}
