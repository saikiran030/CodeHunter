import java.util.Date;


public class demo {
    static int findNumberofIntegerPoints(int radius) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int count=0;
        int k =0;
        int calR = radius*radius;
        for(int i=1;i<radius;i++){
            int check = calR - i*i; //576
            int sqrt = (int) Math.sqrt(check);
            if(sqrt*sqrt == check) {
                count = count+4;
            }
        }
        count = count+4;
        long endTime   = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        return count;
    }

 public static void main(String args[]) throws InterruptedException{
     /*
      * Complete the function below.
      */
     System.out.println(findNumberofIntegerPoints(10000));

     

 }
}