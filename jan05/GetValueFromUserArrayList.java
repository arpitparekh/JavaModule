package jan05;

import java.util.ArrayList;
import java.util.Scanner;

public class GetValueFromUserArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter the size");

        Scanner sc= new Scanner(System.in);
        int z;
        int n =sc.nextInt();

        for(int i=0;i<n;i++){

            z = sc.nextInt();

            list.add(z);

        }

//        for(int i=0;i<n;i++){
//
//            System.out.println(list.get(i));
//        }

        // for each

        for(Integer i : list){
            System.out.println(i);
        }

    }
}
