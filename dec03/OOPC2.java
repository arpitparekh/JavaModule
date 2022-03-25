package dec03;

import java.util.Arrays;
import java.util.Scanner;

public class OOPC2 {

    int arr[];

    OOPC2(int arr2[]){  // parameterize constructor

        arr=arr2;

    }

    void display(){


    }

    public static void main(String[] args) {

        int myArray[]=new int[6];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<myArray.length;i++){

            myArray[i]=sc.nextInt();
        }

        OOPC2 o2 = new OOPC2(myArray);

        System.out.println(Arrays.toString(o2.arr));

    }

}
