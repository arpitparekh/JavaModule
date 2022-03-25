package dec06;

public class FunctionPrograms {

    // 5 // 5*4*3*2*1 // factorial // 6 // 6*5*4*3*2*1

    int result= 1;

    void findFacto(int x){
        // int x =5
        for(int i=1;i<=x;i++){ // 1..5

            result = result *i ;   // result =1 // result =2 // result = 6 // result = 24 // result = 120

        }

        System.out.println("result is :-> "+ result);
        result = 1;

    }

    void findDigit(int p){
        // int p =120000

        int result = 0;
      while(p>0){

          p=p/10;

          result++;
      }
        System.out.println("No Of Digit is -> "+result);

    }



    public static void main(String[] args) {

        FunctionPrograms p =new FunctionPrograms();

        p.findFacto(5);
        p.findFacto(6);
        p.findFacto(4);
        p.findFacto(3);

        p.findDigit(12000);
        p.findDigit(0);
        p.findDigit(10);p.findDigit(1200);


    }
}
