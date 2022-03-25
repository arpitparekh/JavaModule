package dec29;

import java.util.Scanner;

class MyException extends Exception{

    MyException(String data){

        super(data);
    }
}

public class Throws {

    public static void main(String[] args) throws MyException {


        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x<12){

            throw new MyException("maru exception");
        }

    }
}
