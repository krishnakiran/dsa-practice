import java.util.Arrays;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] input = new int[]{4,-1,2,-7,3,4};
        maxSubArray(input);
    }
    private int maxSum(int[] input){
        int maxSum=input[0];
        int currentSum=0;
        for(int i=0;i<input.length;i++){
            currentSum = Math.max(currentSum,currentSum+input[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
         return maxSum;
    }


    private static void maxSubArray(int[] input){
        int maxSum=input[0];
        int currentSum=0;
        int L=0, R=0;
        int maxL=0,maxR=0;

        for(;R<input.length;R++){
            if(currentSum<0){
                currentSum=0;
                L=R;
            }
            currentSum = currentSum+input[R];
            if(currentSum > maxSum){
                maxSum = currentSum;
                maxL=L;
                maxR=R;
            }
        }
        System.out.printf(maxL+"  "+maxR);

    }

}
