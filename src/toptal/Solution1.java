package toptal;

class change{
    public int[] getChange(float M, float P){
        int insertedMoneyInCents = calculateCents(M);
        int itemPriceInCents = calculateCents(P);
        int a[] = {1,5,10,25,50,100};
        System.out.println(insertedMoneyInCents);
        System.out.println(itemPriceInCents);
        int calculateDiff = itemPriceInCents - insertedMoneyInCents;

        for(int i=a.length-1; i>=0;i--){
            int val = calculateDiff/a[i];
            System.out.println(val);
            calculateDiff=calculateDiff-(a[i]*val);
        }
        return null;
    }
    int calculateCents(float F){
        String s= F+" ";
        char[] ch=s.toCharArray();
        boolean b=false;
        String dollars="";
        String Cents="";
        for (char c:
             ch) {
            if(c=='.'){
                b=true;
                continue;
            }

            if(b){
                Cents=Cents+c;
            } else {
                dollars = dollars + c;
            }
        }
        //System.out.println(Cents);
        //System.out.println(dollars);
        int totalCents = (Integer.parseInt(dollars)*100) + (Integer.parseInt(Cents.trim()));
        return totalCents;
    }
}
public class Solution1 {
    public static void main(String[] args) {
        change c=new change();
        c.getChange(5f,0.99f);
    }
}
