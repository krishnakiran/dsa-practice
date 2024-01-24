import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] input = new int[]{1, 4, 6, 8, 10, 12};
        System.out.println(binarySearch(input, 1));
    }

    private static boolean binarySearch(int[] input, int searchElement) {
        int mid = input.length / 2;
        if (input.length > 0) {
            if (searchElement == input[mid]) {
                return true;
            }
            if (searchElement > input[mid]) {
                return binarySearch(Arrays.copyOfRange(input, mid + 1, input.length), searchElement);
            }
            if (searchElement < input[mid]) {
                return binarySearch(Arrays.copyOfRange(input, 0, mid), searchElement);
            }
        }
        return false;
    }
}



