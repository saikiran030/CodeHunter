package spire;

import java.util.List;
import java.util.LinkedList;

class Items {
    List<String> ll=new LinkedList<>();
    synchronized void add(String name) throws Exception{
        ll.add(name);
        System.out.println("Item produced : "+ll);
        if(ll.size()>0){
            notify();
        }
    }

    synchronized void remove() throws InterruptedException {
        if(ll.size()==0){
            wait();
        }
        ll.remove(0);
        System.out.println("After Item consumed : "+ll);
    }
}
class Consumer extends Thread{
    Items i;
    Consumer(Items i){
        this.i=i;
    }
    public void run(){
        try {
            i.remove();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Producer extends Thread{
    Items i;
    Producer(Items i){
        this.i=i;
    }
    public void run(){
        try {
            i.add("item");
            i.add("item1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class MultiThreadProg {
    public static void main(String[] args) {
        Items i = new Items();
        Producer p = new Producer(i);
        p.start();
        Consumer c= new Consumer(i);
        c.start();
    }
}
