package dec29;

class AgeISNotValid extends RuntimeException{

    AgeISNotValid(String data){

        super(data);
    }
}
class Vote{

    void checkAge(int age){

        if(age<18){

            throw new AgeISNotValid("Bhai moto tha");

        }else{
            System.out.println("Allowed");
        }

    }
}
public class ExceptionHandling {

    public static void main(String[] args) {

        Vote v = new Vote();

        try{
            v.checkAge(12);
        }catch (AgeISNotValid e){

            System.out.println(e.getMessage());
        }

        System.out.println("code.........");
    }
}
