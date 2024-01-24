import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProduct {
    public static void main(String[] args) {
        int[] result= productExceptSelfV2(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(result));
    }

    private static int[] productExceptSelfV2(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        leftProduct[0]=1;
        //1,-1,-1,0,0
        for(int i=1;i<nums.length;i++){
            leftProduct[i]=nums[i-1]*leftProduct[i-1];
        }
        //0,0,-9,3,1
        rightProduct[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            rightProduct[i]=nums[i+1]*rightProduct[i+1];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        return result;
    }

    private static int[] productExceptSelf(int[] nums) {
        List<Integer> multiList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int multi=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    multi = multi*nums[j];
                }
            }
            multiList.add(multi);
        }
        return multiList.stream().mapToInt(i -> i).toArray();
    }
}
