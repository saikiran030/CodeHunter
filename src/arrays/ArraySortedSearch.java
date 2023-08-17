package arrays;

public class ArraySortedSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {5, 6, 7, 8, 9, 10};
		 System.out.println(binarySearch(arr,0,arr.length-1,0));
	}	
	static int binarySearch(int arr[], int low, int high, int key)
	{
	   if (high < low)
	       return -1;
	   int mid = (low + high)/2;  /*low + (high - low)/2;*/
	   if (key == arr[mid])
	       return mid;
	   if (key > arr[mid])
	       return binarySearch(arr, (mid + 1), high, key);
	   return binarySearch(arr, low, (mid -1), key);
	}
}
