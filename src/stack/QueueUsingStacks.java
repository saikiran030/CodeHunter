package stack;

import java.util.Scanner;
public class QueueUsingStacks {
	Stack s1 = new Stack();
    Stack s2 = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	QueueUsingStacks st = new QueueUsingStacks();
    	for(int i=0;i<n;i++){
    		int s = sc.nextInt();
    		if(s == 1){
    			int ele = sc.nextInt();
    			st.enQueue(ele);
    			//st.print();
    		}else if(s == 2){
    			st.deQueue();
    			//st.print();
    		}else if(s==3){
    			st.top();
    		}
    	}
    	sc.close();
	}
	
	void enQueue(int ele){
		//if(temp.)
		if(s1.isEmpty()){
			s1.push(ele);
		}else{
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
			s1.push(ele);
			while(!s2.isEmpty()){
				s1.push(s2.pop());
			}
		}
		//s1.print();
	}
	void deQueue(){
		s1.pop();
		//s1.print();
	}
	void top(){
		System.out.println(s1.first());
	}
}
