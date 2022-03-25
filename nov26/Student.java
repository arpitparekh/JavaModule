package nov26;

public class Student {


    int roll_no;   // properties
    String name;
    float height;

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name="ankit";
        s1.height=2343.343f;
        s1.roll_no=10;

        System.out.println(s1.name);
        System.out.println(s1.height);
        System.out.println(s1.roll_no);

        Student s2 = new Student();
        s2.roll_no=34;
        s2.name="sdfsf";
        s2.height=3434.34f;

        System.out.println(s2.name);
        System.out.println(s2.height);
        System.out.println(s2.roll_no);
    }

}


