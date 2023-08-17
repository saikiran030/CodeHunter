package queue;

import java.util.HashMap;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(null, "Swetha");
        hm.put(2, "Amani");
        hm.put(3, "rOHITH");

        Set ss= hm.entrySet();
        Iterator itr = ss.iterator();
        while(itr.hasNext()){
            Map.Entry ee= (Map.Entry)itr.next();
            System.out.println(ee.getKey()+" : "+ee.getValue());
        }

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
