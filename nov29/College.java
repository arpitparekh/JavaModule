package nov29;

public class College {

    // declare

    int roll_number;

    String name;

    void assign(int n , String value){

        roll_number = n;   // assign value using function
        name = value;
    }
    void print(){

        System.out.println(roll_number);
        System.out.println(name);

    }

    public static void main(String[] args) {

        College c =new College();
        College c2 = new College();

//        c.name = "tops";   // assign value using object
//        c.roll_number=34;

        c.assign(12,"tops");
        c2.assign(34,"technology");

        c.print();
        c2.print();


    }
}
