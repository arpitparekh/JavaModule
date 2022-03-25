package dec08;

public class PrimeNumber {

    // prime number

    // 2 3 5 7 11 13 17 19 23 29 31

    void checkPrime(int x){

        // int x = 13

        boolean b = true;

        for(int i=2;i<x;i++){
            if(x%i==0){
                b = false ;
                break;
            }
        }
        if(b){

            System.out.println("Number is prime");
        }
        else{

            System.out.println("NUmber is not prime");
        }

    }

    public static void main(String[] args) {

        PrimeNumber p = new PrimeNumber();

        p.checkPrime(14);

    }
}
