public class SmallSubArray {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    private static int minSubArrayLen(int target, int[] nums) {
        int minimalLength = Integer.MAX_VALUE;
        int currentSum=0;
        int start=0;

        /*
        KeepSliding thru array and see if the sum >= target
        if yes, return current i-start index
        target = 7, nums = [2,3,1,2,4,3]
         */

        for(int end=0;end<nums.length;end++){
            currentSum+=nums[end];
            while (currentSum>=target){
                minimalLength = Math.min(minimalLength,end-start+1);
                currentSum = currentSum-nums[start];
                start++;
            }
        }
        return (minimalLength != Integer.MAX_VALUE) ? minimalLength : 0;
    }
}
