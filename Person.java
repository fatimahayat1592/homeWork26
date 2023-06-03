package homeWork26;

import java.util.Map;
import java.util.TreeMap;

public class Person {
   /* Create a Person class with following private fields: name, lastName, age, salary.
    Variables should be initialized through constructor.
    Inside the class also create a method to print user details.In Test Class create a Map
    that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.*/
    private String name;
    private String lastName;
    private  int age;
    private double salary;
    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class PersonTester{

    public static void main(String[] args) {
        Person p1=new Person("John","Doe",34,87877.0);
        Person p2=new Person("Johny","Deow",37,67677.0);
        Person p3=new Person("Mike","Smith",42,56577.0);
        Map<Integer,Person> map=new TreeMap<>();
        map.put(1,p1);
        map.put(2,p2);
        map.put(3,p3);
        for(var v:map.entrySet()){
            System.out.println(v.getKey()+" "+v.getValue());
        }

       System.out.println( map.toString());
    }
}
