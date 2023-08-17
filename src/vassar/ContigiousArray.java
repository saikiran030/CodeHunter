package vassar;

public class ContigiousArray {
    public static void main(String[] args) {
        int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
        //-5,1
        //find(a);
        findMax(a);
    }

    private static void findMax(int[] a) {
        int j=0;
        int sum=0;
        for (int i=0;i<a.length-2;i++){
            j=i+1;
             sum =sum+a[i]+a[j];

             if(a[j+1]>sum){
                 System.out.println(a[i]+" : "+a[j]);
                 sum=0;
                 i=j;
             }
             //j++;
        }
        System.out.println(sum);
    }

    private static void find(int[] a) {
        int max=0;
        for(int i=0;i<a.length;i++){
            for (int j=1;j<a.length;j++){
                int sum = findSum(i,j,a);
                if(sum>max)
                    max=sum;
            }
        }
        System.out.println(max);
    }

    private static int findSum(int i, int j, int[] a) {
        int sum=0;
        for(int k=i;k<=j;k++){
            sum=sum+a[k];
        }
        return sum;
    }
}
