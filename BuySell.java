class Stock {
    public int maxProfit(int[] prices) {
        int left;
        int low=prices[0],maxP=0;
        for(left=1;left<prices.length;left++)
        {
            maxP=Math.max(maxP, (prices[left]-low));
            low=Math.min(low, prices[left]);
        }

return maxP;
    }
}
public class BuySell {
    public static void main(String[] args)
    {
        Stock s=new Stock();
        int[] prices={10,1,5,6,7,1};
       int res= s.maxProfit(prices);
       System.out.println(res);
    }
}
