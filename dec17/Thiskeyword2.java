package dec17;

import org.jetbrains.annotations.NotNull;

class Employee{
    
    int id;
    String name;
    
    void assign(int id,String name)
    {
        
        this.id = id;
        this.name=name;
    }

    void get(@NotNull Employee meroObject){

        System.out.println(meroObject.id);
        System.out.println(meroObject.name);
    }

    void display(){

        this.get(this);     // u can also user this keyword inside parameter

    }

    void hi(int x){

    }
}

public class Thiskeyword2 {

    public static void main(String[] args) {


        Employee e = new Employee();
        Employee e3 = new Employee();


        e3.assign(45, "madam");

        e.assign(12, "rana");

        e.display();

    }
}
