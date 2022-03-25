package dec10;

public class PrimeNumberBetweenRange {


    void findPrime(int x,int y){

        // int x =10 // int y =30

        boolean b ;

        for(int i=x;i<=y;i++){

            b= true;


            // i = 10 // 11 // 30

            for(int h=2;h<i;h++){

                if(i%h==0){

                    b= false;
                    break;
                }

            }

            if(b){

                System.out.println(i);
            }



        }

    }


    public static void main(String[] args) {

        PrimeNumberBetweenRange r = new PrimeNumberBetweenRange();

        r.findPrime(10,30);

    }
}
