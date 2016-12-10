package com.inuker.solution;

/**
 * Created by dingjikerbo on 16/12/1.
 */

public class HouseRobber {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        // dp意思是统计到当前房子为止的最大收益
        int[] dp = new int[n];

        // 这里要注意越界的问题
        for (int i = 0; i < n; i++) {
            dp[i] = Math.max(nums[i] + (i > 1 ? dp[i - 2] : 0), i > 0 ? dp[i - 1] : 0);
        }
        return dp[n - 1];
    }
}