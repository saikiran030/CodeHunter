package stack;

import java.util.Scanner;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Stack {
	static int max_val = 100000;
	int a[] = new int[max_val];
	int top;
	Stack(){
		top = -1;
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	Stack st = new Stack();
    	for(int i=0;i<n;i++){
    		int s = sc.nextInt();
    		if(s == 1){
    			int ele = sc.nextInt();
    			st.push(ele);
    			//st.print();
    		}else if(s == 2){
    			st.pop();
    			//st.print();
    		}else if(s==3){
    			st.peek();
    		}
    	}
    	sc.close();
    	//st.print();
    }
    
    void push(int ele){
    	if(top > max_val){
    		System.out.println("Stack Overflow");
    	}else{
    		a[++top] = ele;
    	}
    }
    int pop(){
    	int value = 0;
    	if(top < 0){
    		System.out.println("Stack Underflow");
    	}else{
    		value = a[top--];	
    	}
    	return value; 
    }
    void peek(){
    	if(top>=0 && top <= max_val){
    		int max=0;
    		for (int counter = 0; counter <= top; counter++)
    		{
    		     if (a[counter] > max)
    		     {
    		      max = a[counter];
    		     }
    		}
    		System.out.println(max);
    	}
    }
    
    int first(){
    	return a[top];
    }
    boolean isEmpty(){
    	if(top < 0)
    		return true;
    	return false;
    }
    
    void print(){
    	for(int i=0;i<=top;i++){
    		System.out.print(a[i]+" ");
    	}
    }
} 