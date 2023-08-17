/**
 * 
 */
package arrays;

/**
 * @author saikiran02
 *
 */
public class ArraySearch {

	/**
	 * 
	 */
	public ArraySearch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,40,30,50,70,60};
		ArraySearch as = new ArraySearch();
		int position = as.findElement(a,50);
		if (position==-1)
	        System.out.println("Element not found");
	    else
	        as.deleteElement(a,position);
	}
	
	int findElement(int a[],int key){
		int i;
	    for (i=0; i<key; i++)
	        if (a[i] == key)
	            return i;
	 
	    return -1;
	}

	public void deleteElement(int[] a, int position) {
		// TODO Auto-generated method stub
		for(int i = position;i<a.length-1;i++){
			a[i] = a[i+1];
		}
		for (int i=0;i<=a.length-2;i++)
	    {
	        System.out.println(a[i]);
	    }
	}
}

