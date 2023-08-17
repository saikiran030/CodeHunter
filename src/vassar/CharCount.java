package vassar;

import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String inputText= "Hello 😍 Count the Characters in given 💕 Text Ӝ You can ingore the lower/upger case 💕 😍 🎼🎼🎼!";
        char ch[] = inputText.toLowerCase().toCharArray();
        HashMap<Character,Integer> hm= new HashMap<>();

        for (char c : ch){
          //  c= (char) ((char)c+48);
            if(isCharacter(c)){
                if(hm.containsKey(c)){
                    hm.put(c,hm.get(c)+1);
                } else {
                    hm.put(c,1);
                }
            }
        }

        System.out.println(hm);
    }

    private static boolean isCharacter(char c) {
        if(c>=49 && c<75 || c>=97 && c<123)
            return true;
        return false;
    }
}
