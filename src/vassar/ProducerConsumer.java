package vassar;

import java.util.LinkedList;
import java.util.List;

class Items{
    List<String> l=new LinkedList();
    synchronized void add(String s){
        if(l.size()>0) {
            try{
                notify();
            } catch (Exception e){

            }

        }
        l.add(s);
        System.out.println("Produced : "+l);
    }
    synchronized void remove(){
        if(l.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        l.remove(0);
        System.out.println("Consumed : "+l);
    }
}


class Consumer extends Thread{
    Items i;
    Consumer(Items i){
        this.i=i;
    }
    public void run(){

            i.l.remove(0);

    }
}

class Producer extends Thread{
    Items i;
    Producer(Items i){
        this.i=i;
    }
    public void run() {

        i.add("item");
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        Items i=new Items();
        Producer p1 =new Producer(i);
        Producer p2 =new Producer(i);
        Producer p3 =new Producer(i);
        Consumer c1 = new Consumer(i);

        p1.start();
        p2.start();
        p3.start();

        c1.start();
    }
}
