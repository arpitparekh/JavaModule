package dec08;

import java.util.Scanner;

public class FunctionRevision {

    // 1 1 2 3 5 8 13 21  / fibonacci
    // / / a b c

    void findFibo(int n){

        int a;
        int b;
        int c;

        a=1;
        b=1;


        // a = 1 / 1 / 2 / 3 / 5
        // b = 1 / 2 / 3 / 5 / 8
        // c = 2 / 3 / 5 / 8 / 13

        for(int i=0;i<n;i++){

            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }



    }


    public static void main(String[] args) {

        FunctionRevision r = new FunctionRevision();

        r.findFibo(8);

        System.out.println("Enter Character");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        if(name.length()>1){
            System.out.println("only Characters are allowed");
        }else{
            System.out.println(name.charAt(0));
        }

    }
}
