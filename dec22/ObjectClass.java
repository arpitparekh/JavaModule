package dec22;

// parent class of all the is Object class

import java.util.Objects;

class Employee {

    int age;
    int id;
    String name;
    float salary;

    void set(int age,int id,String name,float salary)
    {
        this.age=age;
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public boolean equals(Object o) {                  // check content of object
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && id == employee.id && Float.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {                         // int value of an object
        return Objects.hash(age, id, name, salary);
    }

    @Override
    public String toString() {            // convert whole object into string
        return
                "age= " + age +
                "\nid= " + id +
                "\nname= " + name+
                "\nsalary= " + salary;
    }
}


public class ObjectClass {

    public static void main(String[] args) {

        Employee e = new Employee();
        Employee e2 = new Employee();

        e.set(12,43,"keval",22000.54f);
        e2.set(12,43,"keval",22000.54f);

//        System.out.println(e);

        System.out.println(e.equals(e2));

        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());

        //    ==   and equals()

        // == check memory location

        int x =45;
        int y =45;

        System.out.println(x==y);
    }
}
