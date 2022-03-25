package dec03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {

        int arr[]=new int[10];

        int arr2[]={1,2,3,4,5,6};

        System.arraycopy(arr2,0,arr,0,5);

        System.out.println(Arrays.toString(arr));



    }
}
