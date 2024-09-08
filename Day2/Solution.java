import java.util.*;
public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;

        int[] preMax = new int[prices.length];

        int max = -1;

        for(int i=prices.length-1;i>=0;i--){
            if(max>prices[i]){
                preMax[i] = max;
            } else{
                preMax[i] = prices[i];
            }
            max = Math.max(max, prices[i]);
        }

        for(int i=0;i<prices.length;i++){
            int diff = preMax[i] - prices[i];
            ans = Math.max(diff, ans);
        }

        return ans;
    }
}
