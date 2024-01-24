import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    //Input: s = "abcabcbb"
    /*
    cur=a;
    97->0,curLen=1
    98->1,cunLen=2
    99->2,curLen=3
    lastIndex=0
    startIndex=1
    cunLen=3-1+1
    97=>3

        abcabcbb
       right=0,set:a,max=1
       right=1,set:ab,max=2
       right=2,set:abc,max=3
       right=3,set:bc,max=3
       right=4,set:c,max=3
       right=5,set:cb,

        b,c,a=>left=1,right=3,max=3
        c,a,b=>left-2,right=4,max=3
        a,b,c=>left=3,right=5,max3
        c,b=>left=5,right=6,max=3
        b=>left=7,right=7,max=3
     */

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}


