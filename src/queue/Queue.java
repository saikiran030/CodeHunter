package queue;

public class Queue {
	int front;
	int rear;
	int capacity;
	static int max_val = 100000;
	int a[] = new int[max_val];
	Queue(){
		capacity = 0;
		front = 0;
		rear = -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.deQueue();
		q.enQueue(4);
		q.enQueue(5);
		q.deQueue();
		q.print();
	}
	void enQueue(int data){
		if(rear > max_val){
			 System.out.println("Overflow ! Unable to add element");
		}else{
			a[++rear] = data;
			capacity++;
		}
	}
	void deQueue(){
		if(capacity == 0){
			System.out.println("Underflow ! Unable to remove element from Queue");
		}else{
			front++;
			capacity--;
		}
	}
	void print(){
		for(int i=front;i<=rear;i++){
			System.out.print(a[i]+" ");
		}
	}
}
