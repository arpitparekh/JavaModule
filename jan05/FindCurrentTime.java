package jan05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FindCurrentTime {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        Date date = new Date();

        System.out.println(date);


    }
}
