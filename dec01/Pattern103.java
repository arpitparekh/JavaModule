package dec01;

public class Pattern103 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){   // i = 1 , 2 ,5

            for(int j=1;j<=i;j++){  // *

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
