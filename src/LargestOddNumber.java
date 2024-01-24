import java.math.BigInteger;

public class LargestOddNumber {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String  input = "52";
        System.out.println(largestOddNumber(input));
        long end = System.nanoTime();
        System.out.println("Time Taken :: "+(end-start));
    }
    private static String  largestOddNumber(String num) {
        if ((int) num.charAt(num.length() - 1) % 2 == 1) {
            return num.toString();
        }
        int endIndex = num.length() - 1;
        while (endIndex >= 0) {
            if ((int) num.charAt(endIndex) % 2 == 1) {
                return num.substring(0, endIndex+1);
            }
            endIndex--;
        }
        return "";
    }
}
