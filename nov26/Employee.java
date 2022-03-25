package nov26;

public class Employee {

    // class members

    String name;
    int id;
}

class Demo{

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name="sapan";
        e.id=34;


        System.out.println(e.name);
        System.out.println(e.id);

    }
}
