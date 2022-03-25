package nov29;

import java.util.Arrays;
import java.util.Scanner;

public class ArrrayAnother {

    public static void main(String[] args) {

        int arr[] = new int[5];

        int arr2[] = new int[6];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){

            arr[i]  = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        // to copy array into another
        System.arraycopy(arr,2,arr2,0,3);

        System.out.println(arr.length);

        System.out.println(Arrays.toString(arr2));

    }
}

