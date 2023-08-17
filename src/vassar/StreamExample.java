package vassar;

import java.util.LinkedList;
import java.util.List;

class Employee{
    int id;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    String name;
    int salary;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }
}
public class StreamExample {
    public static void main(String[] args) {
        List ll=new LinkedList();
        Employee ee= new Employee(1,"abc",6000);
        Employee ee1= new Employee(1,"abc",8000);
        Employee ee2= new Employee(1,"abc",4000);

        ll.add(ee);
        ll.add(ee1);
        ll.add(ee2);

        //ll.stream().filter(e->e.salary>5000).forEach(System.out::println);
    }
}
