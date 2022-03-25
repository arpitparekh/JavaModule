package dec24;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmailFormat {

    public static void main(String[] args) {

        // regex

        System.out.println("Enter Email \n");
        Scanner sc = new Scanner(System.in);

        String email;

        email = sc.next();

        Pattern p = Pattern.compile("[a-zA-Z0-9._-]+@[a-z]+\\.[a-z]+");

        Matcher matcher = p.matcher(email);

        System.out.println(matcher.matches());


        String data = "Tops";   // immutable

        data.toLowerCase();
        data.split("//s");

        System.out.println(data.toUpperCase());

        System.out.println(data);


    }
}
