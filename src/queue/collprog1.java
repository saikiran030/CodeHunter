package queue;

import java.lang.*;
import java.util.*;
public class collprog1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("names");
        list1.add("flowers");
        list1.add("vegitables");
        list1.add("grocery");
        list1.add("plants");
        //list1.remove("flowers");
        //list1.clear();
        System.out.println(list1.size());
        Iterator ltr = list1.iterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());

        }


    }
}
