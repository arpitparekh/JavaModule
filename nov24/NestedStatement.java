package nov24;

public class NestedStatement {

    public static void main(String[] args) {

        // if else ladder

        int x =9;

        if(x<10){

            if(x<13){

                if(x>9){

                    System.out.println("inner inner if");
                }else{

                   if(x>9){

                       System.out.println("inner inner inner if");
                   }else{

                       System.out.println("inner inner inner else");
                   }
                }
            }
            else{

                System.out.println("Inner else");
            }

        }else{
            System.out.println("this is outer else");

        }
    }
}
