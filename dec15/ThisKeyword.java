package dec15;


class Employee{

    int id;    // class properties
    String name;
    String email;
    float salary;

    Employee(){
        this(12);  // always first statement
        System.out.println("This is default constructor");
    }
    Employee(int x){
//        this();                   // calling class constructor
        System.out.println(x);
    }





    void assign(int id,String name,String email,float salary){

        // this
        // this keyword refers to the current class object
        // we can only use this within the class

        this.id = id ;
        this.name = name;
        this.email=email;
        this.salary=salary;
    }

    void extra(){
        this.assign(12,"Nilam madam","nilam@yahoo.com",15000);
    }



}

public class ThisKeyword {

    // this

    public static void main(String[] args) {

        Employee e = new Employee();

        e.assign(12,"Nilam madam","nilam@yahoo.com",15000);

    }
}
