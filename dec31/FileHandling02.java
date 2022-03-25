package dec31;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling02 {

    public static void main(String[] args) {


//        File  file = new File("C:\\java stream\\hello.txt");

        String data = " How r u ?";
        // FileWriter
        // FileReader

        try{
            FileWriter writer = new FileWriter("C:\\java stream\\hello.txt",true);
            writer.write(data);
            writer.close();

            ///////////////////////////////

//            FileReader reader = new FileReader("C:\\java stream\\hello.txt");
////            System.out.println(reader.read());
//            int i=0;
//            while((i=reader.read())!=-1){
//
//                System.out.print((char)i);
//
//            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
