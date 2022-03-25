package jan07;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;

class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class CompareByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age>o2.age){
            return 1;
        }else if(o1.age<o2.age){
            return -1;
        }else{
            return 0;
        }

    }
}

class CompareByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        return o1.name.compareTo(o2.name);
    }
}

public class ComparatorCollection {



    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("nilam",38));
        list.add(new Student("keval",21));
        list.add(new Student("jay",20));
        list.add(new Student("yatin",24));
        list.add(new Student("dipti",36));
        list.add(new Student("arpit",25));

        list.sort(new CompareByName());

        System.out.println(list);


    }

}
