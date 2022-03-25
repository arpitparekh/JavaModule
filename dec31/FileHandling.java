package dec31;

import java.io.*;
import java.util.Arrays;

public class FileHandling {

    public static void main(String[] args) {


        // 20mb  // 1 gb

        // Stream  // divide data in smaller bits

        // ByteStream  //  byte  // 1 byte // divide data in bytes

        // CharacterStream // String  // divide data in individual character

        // "tops"  //  t(113)   o   p   s

        // ByteStream

        File file = new File("C:\\java stream\\helloNew.txt");

//        try{
//
//            if(file.createNewFile()){
//                System.out.println("File created successfully");
//            }else{
//                System.out.println("Error");
//            }
//
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }

//        String data = "Tops"; // ram

        // byteStream

        // FileInputStream // FileOutputStream

        // to write data we need fileOutputStream

        try{

            FileOutputStream os = new FileOutputStream(file); // write
            DataOutputStream ds = new DataOutputStream(os);
            ds.writeInt(45);
//            os.write(data.getBytes());
            ds.close();
//            os.close();

            //////////////////////////////////////////////////

            FileInputStream is = new FileInputStream("C:\\java stream\\helloNew.txt");  // read
//            DataInputStream di = new DataInputStream(is);
//            FilterInputStream fi = new FilterInputStream(is);
//            byte arr[]= new byte[di.available()];
//            System.out.println(di.readInt());

//            int i=0;
//            di.read
//            while((i=di.read())!=-1){
//                System.out.println(i);
//            }


//            String data = new String(arr);
//            System.out.println(data);
//            byte arr[]=new byte[is.available()];
//            is.read(arr);

//            System.out.println(Arrays.toString(arr));

//            String result = new String(arr);
//
//            System.out.println(result);

//            di.close();


        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }





    }
}
