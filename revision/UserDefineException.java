package revision;

import java.util.Arrays;
import java.util.Scanner;

class OBhai extends RuntimeException{

    OBhai(String data){
        super(data);
    }

}

public class UserDefineException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer Value");

        int arr[]=new int[10];

        for (int i=0;i<arr.length;i++){

            int number= scanner.nextInt();

            try{
                if(number<10 || number>40){
                    throw new OBhai("Bhai 10 thi nani ane 40 thi moti value na nakh");
                }else{
                    arr[i]=number;
                }
            }catch (OBhai e){
                System.out.println(e);
            }


        }

        System.out.println(Arrays.toString(arr));

    }
}
