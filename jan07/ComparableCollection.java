package jan07;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        if(age>o.age){
            return 1;
        }else if(age<o.age){
            return -1;
        }else{
            return 0;
        }

    }
}

public class ComparableCollection {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("nilam",38));
        list.add(new Employee("keval",21));
        list.add(new Employee("jay",20));
        list.add(new Employee("yatin",24));
        list.add(new Employee("dipti",36));
        list.add(new Employee("arpit",25));

        Collections.sort(list);

        System.out.println(list);
    }
}
