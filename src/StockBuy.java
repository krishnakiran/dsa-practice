import java.util.Arrays;

public class StockBuy {
    public static void main(String[] args) {
        StockBuy stockBuy = new StockBuy();
        System.out.println(stockBuy.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    private int maxProfit(int[] prices){
        int profit=0;
        int buy = prices[0];
        for(int i=1;i< prices.length;i++){
            int sell = prices[i];
            if(sell > buy){
                profit = Math.max(profit,(sell-buy));
            }
            else {
                buy = sell;
            }
        }
        return profit;
    }

    //[7,1,5,3,6,4]
   /* private int maxProfit(int[] prices){
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            int maximumFuture = maximum(Arrays.copyOfRange(prices,i+1,prices.length)) ;
            int profit = maximumFuture-prices[i] > 0 ? maximumFuture-prices[i] : 0;
            if(profit >= maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    private int maximum(int[] subArray){
        int max = 0;
        for(int i=0;i<subArray.length;i++){
            if(max <= subArray[i]){
                max = subArray[i];
            }
        }
        return max;
    }*/
}
