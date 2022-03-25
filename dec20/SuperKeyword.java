package dec20;

class Student{
    int roll;
    String name;

    Student(){
        System.out.println("THis is parent constructor");
    }

    void display(){

        System.out.println(roll);
        System.out.println(name);
    }
}

class Exam extends Student{

    Exam(){

        super();               // calling a parent class constructor

    }

    void assign(int roll,String name){

        super.name=name;
        super.roll=roll;

    }

    void print(){

        super.display();
    }

}


public class SuperKeyword {

    public static void main(String[] args) {

        Exam e = new Exam();

        e.assign(12,"pushpa");
        e.print();
    }
}
