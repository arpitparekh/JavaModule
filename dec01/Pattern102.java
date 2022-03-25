package dec01;

public class Pattern102 {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){  // 1 // 2

            for(int j=5;j>=i;j--){

                // * * * * *
                // * * * *
                //

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
