package revision;

public class ExceptionRevision {

    void f(int x){
        System.out.println(x);
    }

    public static void main(String[] args) {

        // exception is abnormality

        // exception


        // compile time // FileNotFound // SQL Exception

        //

        // run time // index out of bound // arithmetic exception


//        System.out.println(34/0);

        int arr[]={1,2,3,4,5};

//        System.out.println(arr[10]);

        String g = "1234";
        Integer i2  = Integer.parseInt(g);
        System.out.println(i2);

        int x =23;
        String data = String.valueOf(x);
        System.out.println(data);

        String name = "tops";

        try{
            for(int i=0;i<5;i++){

//                System.out.println(name.charAt(i));

                String n =null;

                ExceptionRevision e;

                System.out.println(n.length());

            }
        }catch (Exception e){

            System.out.println(e.toString());
        }

    }
}
