package dec01;

import dec03.Employee;

public class Pattern101 {

    public static void main(String[] args) {



        int arr[][]= new int[5][5];

        for(int i=1;i<=5;i++){   // i = 1 , 2 ,5


            for(int k=4;k>=i;k--){

                System.out.print(" ");

            }

            for(int j=1;j<=i;j++){  // *

                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
