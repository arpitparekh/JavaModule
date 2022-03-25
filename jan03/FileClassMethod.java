package jan03;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileClassMethod {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\java stream\\MyFolder");

        if(file.mkdir()){  // mkdir()  // create folder

            System.out.println("folder created Successfully");
        }else{
            System.out.println("folder not created ");
        }

        File innerFile = new File(file,"hello.txt");


        innerFile.createNewFile();

//        innerFile.delete();
        String[] list = new String[file.list().length];
        list =file.list();

        System.out.println(Arrays.toString(list));

        System.out.println(innerFile.length());

        System.out.println(innerFile.isDirectory());

        System.out.println(innerFile.isFile());

        System.out.println(innerFile.exists());

        System.out.println(innerFile.canRead());

        System.out.println(innerFile.canWrite());

        System.out.println(innerFile.getAbsoluteFile());

    }
}
