package dec08;

// inheritance

// when child class's object access properties of parent class it's called inheritance

import java.util.Arrays;

class A{  // parent  // base

    int x;
    String name;
    float f;

    int arr[]=new int[10];

}
class B extends A{  // child  // derived


    void apply(int x1,String name1,float f1,int arr1[]){

        x=x1;
        name = name1;
        f=f1;
        arr=arr1;
    }

    void print(){
        System.out.println(x);
        System.out.println(name);
        System.out.println(f);
        System.out.println(Arrays.toString(arr));
    }
}


public class Inheritance {

    public static void main(String[] args) {

        B b = new B();

        int arr[]={1,2,3,4,5};

        b.apply(12,"top",34.56f,arr);

        b.print();

    }

}
