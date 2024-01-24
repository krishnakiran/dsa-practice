public class BinarySearchV2 {
    public static void main(String[] args) {
        int[] input = new int[]{-1,0,3,5,9,12};
        int target=15;
        //System.out.println(search(input,target));
        System.out.println(find(input,target));
    }
    public static int search(int[] input, int target) {
        int result = test(input,target,0,input.length-1);
        return result;
    }

    private static boolean find(int[] input,int searchElement){
        int mid=0;
        int left=0;
        int right=input.length-1;

        while(left<=right){
            mid = (right+left)/2;
            if(input[mid] == searchElement){
                return true;
            }
            if(searchElement< input[mid]){
                right=mid-1;
            }
            if(searchElement>input[mid]){
                left=mid+1;
            }
        }
        return false;
    }
    /*
    left=0,right=5,mid=2
    left=3,right=5,mid=4
     */

    private static int test(int[] input, int searchElement, int startIndex, int endIndex) {
        int mid = (startIndex+endIndex) / 2;
        if(startIndex<input.length && endIndex>0) {
            if (searchElement == input[mid]) {
                return mid;
            }
            if (searchElement > input[mid]) {
                return test(input, searchElement, mid + 1, endIndex);
            }
            if (searchElement < input[mid]) {
                return test(input, searchElement, startIndex, mid);
            }
        }
        return -1;
    }
}
