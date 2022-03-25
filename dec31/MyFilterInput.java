package dec31;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class MyFilterInput extends FilterInputStream{


    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected MyFilterInput(InputStream in) {
        super(in);
    }

    public static void main(String[] args) {
        String name = "tops";
        try{
            FilterOutputStream fo = new FilterOutputStream(new FileOutputStream("C:\\java stream\\hello.txt"));
            fo.write(name.getBytes(),0,4);
            fo.close();

            /////////////////////////////////////////////

            MyFilterInput filterInput = new MyFilterInput(new FileInputStream("C:\\java stream\\hello.txt"));
            byte b[]=new byte[filterInput.available()];
            filterInput.read(b,0,2);
            String data = new String(b, StandardCharsets.UTF_8);

            String clean = data.replaceAll("\\P{Print}", "");

            System.out.println(clean);


        }catch (Exception e){

        }

    }
}
