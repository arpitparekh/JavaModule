package dec17;

class MyClass{

    // this refers to the current class object

    int id;
    String name;

    MyClass(){
    }
    MyClass(int id,String name){

        this();                       // call constructor using this keyword

        this.id=id;                    // access property using this keyword
        this.name=name;
    }
    void display(){

    }void print(){

        this.display();            // access methods using this keyword
    }
}


public class ThisKeyword {

    public static void main(String[] args) {

    }
}
