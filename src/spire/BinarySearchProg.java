package spire;

public class BinarySearchProg {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int search_element=5;
        boolean status = binarySearch(a,search_element);
        if(status)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    private static boolean binarySearch(int[] a,int search_element) {
        int start=0;
        int end=a.length;
        int middle=a.length/2;

        while (start<=end){
            System.out.println(start+ " : "+ middle+" : "+end);
            if(search_element > a[middle]){
                start = middle;
                middle = (start+end)/2;
            }

            if(search_element < a[middle]){
                end = middle;
                middle = (start+end)/2;
            }

            if(search_element == a[middle])
                return true;
        }


        return false;
    }
}
