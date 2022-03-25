package nov26;

import java.util.Scanner;

public class Faculty {

    int number;
    float height;

    public static void main(String[] args) {

        System.out.println("Enter Data");
        Faculty f = new Faculty();

        Scanner sc = new Scanner(System.in);

        f.number = sc.nextInt();
        f.height=sc.nextFloat();

        System.out.println(f.number);
        System.out.println(f.height);

    }
}
