package Day1;

import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            } else{
                map.put(nums[i],i);
            }
        }

        return ans;
    }
}