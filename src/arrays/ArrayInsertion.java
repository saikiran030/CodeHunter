package arrays;

import java.util.Scanner;

public class ArrayInsertion {

	public ArrayInsertion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
	    for(int i=0;i<3;i++)
	    {
	        System.out.println("Enter the Element : ");
	        a[i]=sc.nextInt();

	    }
	    sc.close();
	    ArrayInsertion ai = new ArrayInsertion();
	    ai.InsertElement(a,3,8);
	   

	    
	}

	void InsertElement(int[] a, int k, int j) {
		// TODO Auto-generated method stub
		a[k] = j; 
		System.out.println("New Array is : ");
		for (int i=0;i<=a.length-1;i++)
	    {
	        System.out.println(a[i]);
	    }
	}

}
