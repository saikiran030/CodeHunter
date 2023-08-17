package queue;

import java.util.Iterator;
import java.util.LinkedList;

class Student{
    int id;
    String name;
    int toaMarks;
    Student(int id, String name, int toaMarks){
        this.id=id;
        this.name=name;
        this.toaMarks=toaMarks;
    }
}
public class ListObj {
    public static void main(String[] args) {
        Student s1=new Student(1,"Swetha",45);
        Student s2=new Student(2,"Amani",70);
        Student s3=new Student(3,"JavaGeek",33);

        LinkedList<Student> ll= new LinkedList<Student>();
        ll.add(s1);
        ll.add(s2);
        ll.add(s3);

        Iterator itr=ll.iterator();
        while (itr.hasNext()){
            //System.out.println(itr.next());
            System.out.println(((Student) itr.next()).id);


        }

    }
}
