import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] output = twoSum(new int[]{3,3},6);
        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> sumMap = new HashMap<>();
            //nums = [2,7,11,15], target = 9
            for(int i=0;i<nums.length;i++){
                if(sumMap.containsKey(nums[i])){
                    return new int[]{sumMap.get(nums[i]),i};
                }
                sumMap.put(target-nums[i],i);
            }
            return null;
    }

}
