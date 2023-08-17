package vassar;

public class RotationString {
    public static void main(String[] args) {
        String name="ABCCBA";
        char ch[] = name.toCharArray();
        int j=ch.length-1;
        boolean status = true;
        for (int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[j]) {
                status = false;
                break;
            }
            j--;
        }

        if(status)
            System.out.println("Matched");
        else
            System.out.println("Not Matched");
    }
}
