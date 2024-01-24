import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> output = obj.threeSum(input, -1);
        output.stream().forEach(System.out::println);
    }

    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            int twoSum = target - nums[i];
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                if (nums[left] + nums[right] == twoSum) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // skip the same ones
                    while (left < right && nums[left] == nums[left+1]) left ++;
                    while (left < right && nums[right] == nums[right-1]) right --;
                    left++; right--;
                }
                else if (nums[left] + nums[right] < twoSum) {
                    left ++;
                } else {
                    right --;
                }
            }
        }
        return result;
    }

    private int[] findTwosum(int[] nums,int target){
        Map<Integer,Integer> resultMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target - i;
            if (resultMap.containsKey(diff)) {
                return new int[]{i, resultMap.get(diff)};
            } else {
                resultMap.put(diff, i);
            }
        }
        return null;
    }
}
