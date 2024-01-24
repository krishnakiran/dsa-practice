import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maximumSubArray(new int[]{-2,-1,-3,-4}));
    }

    /*
        -2,-1,-3,-4
        i=0 -> cur =-2 max=-2
        i=1->  cur=-1, max=-1
        i=2->  cur=-3, max=-1
        i=3->  curr=-4, max=-1
     */
    //[-2,1,-3,4,-1,2,1,-5,4]
  /*  private static int maxSubArray(int[] nums) {
        int max = Arrays.stream(nums).sum();
        int endIndex = nums.length-1;
        Map<Integer,Integer> sumEndIndexMap = new HashMap<>();
        while (endIndex > 0){
            int[] subArray = Arrays.copyOfRange(nums,0,endIndex);
            int sum = Arrays.stream(subArray).sum();
            if(!sumEndIndexMap.containsKey(sum)){
                sumEndIndexMap.put(sum,endIndex);
            }
            max = Math.max(max,sum);
            endIndex--;
        }
        if(sumEndIndexMap.containsKey(max)){
            endIndex = sumEndIndexMap.get(max);
        }
        //Arrays.stream(Arrays.copyOfRange(nums,0,endIndex)).sum();
        return max;
    }*/

    /*
    -2,1,-3,4,-1,2,1,-5,4
    i=0-> cur=-2 max=-2
    i=1 -> cur=-1, max=-1
    i=2-> cur=-3,max=-1
    i=3-> cur=4,max=4
    i=4-> cur=3,max=4
    i=5->cur=5,max=5
    i=6->cur=6,max=6
    i=7->cur=1,max=6
    i=8->cur=5,max=6
     */
    private static int maximumSubArray(int[] nums){
        int currentSum=0,maxSum=Integer.MIN_VALUE;
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            currentSum = Math.max(nums[i],nums[i]+currentSum);
            if(currentSum <0){
                start=i+1;
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
                end=i;
            }
        }
        System.out.println("start::"+start+"  end::"+end);
        return maxSum;
    }
    //brute force
    private static int maxSubArray(int[] nums) {
        int max= Arrays.stream(nums).max().getAsInt();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int[] subArray = Arrays.copyOfRange(nums,i,j+1);
                int sum = Arrays.stream(subArray).sum();
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
