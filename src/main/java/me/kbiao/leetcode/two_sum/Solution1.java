/**
 * Leetcode - two_sum
 */
package me.kbiao.leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {


    @Override
    public int[] twoSum(int[] nums, int target) {

//        HashMap input = new HashMap();
        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
