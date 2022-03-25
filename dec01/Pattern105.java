package dec01;

public class Pattern105 {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){  // 1 // 2 // 3

            for(int p=4;p>=i;p--){

                System.out.print(p);
            }

            for(int q=3;q<(2*i)+1;q++){

                System.out.print(" ");
            }


            for(int r=4;r>=i;r--){

                System.out.print(r-1);
            }

            System.out.println();
        }
    }
}
