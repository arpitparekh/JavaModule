package dec20;

class Employee{

    int age;             // properties  // this  // rerfers to the current class object
    float salary;

    Employee(){
        this(12,67.6f);
        System.out.println("This is default constructor");
    }

    Employee(int age,float salary){

//        this();                   // calling another constructor of same class

        this.age=age;             // property class
        this.salary=salary;
    }

    void assign(Employee e){

        System.out.println(e.age);
        System.out.println(e.salary);

    }

    void apply(){

        this.assign(this);              // use this is method arguments

    }




    void print(){

        System.out.println(age);
        System.out.println(salary);
    }

    void display(){

        this.print();   // method class

    }

}

public class ThisKeyword {

    public static void main(String[] args) {

        // this
        // super
        // final
        Employee e = new Employee(12,12.2f);

        e.apply();


    }

}
