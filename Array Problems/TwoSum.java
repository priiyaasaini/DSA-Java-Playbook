/**
 * 🔗 Problem: Two Sum
 * Leetcode: https://leetcode.com/problems/two-sum/
 * 
 * 💡 Approach:
 * Use a HashMap to store numbers and their indices.
 * For each element, check if (target - current) already exists.
 * 
 * ⚡ Hint:
 * Instead of checking all pairs, store visited elements.
 * 
 * ⏱ Time Complexity: O(n)
 * 💾 Space Complexity: O(n)
 * 
 * 🧩 Pattern: Hashing
 *  * 📝 Notes:
 * Avoid brute force O(n^2), use HashMap for optimization.
 */
import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}