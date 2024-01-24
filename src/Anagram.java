import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        System.out.println(anagram.isAnagram("anagram","nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            Arrays.sort(sArray);
            Arrays.sort(tArray);
            s = new String(sArray);
            t = new String(tArray);
            if(!s.equals(t)){
                return false;
            }
        }
        else {
            return false;
        }
        return true;
    }

}


