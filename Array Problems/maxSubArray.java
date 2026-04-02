
// 🔹 Kadane’s Algorithm (Maximum Subarray Sum)

// 👉 Problem:
// Find the maximum sum of a contiguous subarray.

// 👉 Intuition:
// At each index, decide:
// 1. Extend previous subarray
// 2. Start new subarray from current element

// 👉 Variables:
// bestEnding → max sum ending at current index
// ans → overall max sum

// 👉 Logic:
// bestEnding = max(nums[i], bestEnding + nums[i])
// ans = max(ans, bestEnding)

// 👉 Why nums[0] initialization?
// Handles edge case when all elements are negative

// 👉 Time Complexity: O(n)
// 👉 Space Complexity: O(1)

// 👉 Key Idea:
// "If previous sum becomes harmful, restart from current element"

// 👉 Pattern:
// Used in problems involving:
// - contiguous subarray
// - max/min sum optimization
class maxSubArray{
    public int findMaxSubArray(int[] nums) {
        int bestEnding=nums[0];
        int ans=nums[0];
        for (int i=1;i<nums.length;i++){
            int sum1=bestEnding+nums[i];
            int sum2=nums[i];
            bestEnding=Math.max(sum1,sum2);
            ans=Math.max(bestEnding,ans);
            
        }
        return ans;
    }
    
}
