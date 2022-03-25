package dec01;

public class Pattern106 {

    public static void main(String[] args) {

        int k =1;

        for(int i=1;i<=5;i++){   // i = 1 , 2 ,5

            for(int j=1;j<=i;j++){  // *
                if(k<10){
                    System.out.print("0"+k+"  ");
                }else{
                    System.out.print(k+"  ");
                }

                k++;
            }

            System.out.println();
        }
    }
}
