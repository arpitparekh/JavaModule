package nov29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayclass {

    public static void main(String[] args) {

        // 12 45 67 87 1 3 2

        // 1 2 3 87 67 45 12
        // Arrays.sort();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();

        int arr[]= new int[size];

        System.out.println("Enter values in the array");
        for(int i=0;i<size;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("Your array is :->");

        System.out.println(Arrays.toString(arr));

        System.out.println("Sorted Array is :->");  // 13 // 10 //78 //43 //90 /
                                                    // 10 // 13
        for(int i =0;i< size;i++){  // 0

            for(int j=i+1 ; j<size;j++ ){
                int temp=0;
                if(arr[i]>arr[j]){

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
