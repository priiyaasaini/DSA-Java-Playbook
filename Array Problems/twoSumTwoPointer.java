// 🔗 Problem: Two Sum II (Sorted Array)

// 🧩 Pattern: Two Pointer

// 💡 Key Idea:
// Array is sorted → we can use two pointers instead of HashMap.
// Move pointers based on sum comparison.

// ⚙️ Approach:
// 1. Initialize:
//    - left = 0
//    - right = n - 1

// 2. While left < right:
//    - sum = numbers[left] + numbers[right]

//    - If sum == target:
//        return [left + 1, right + 1]  // 1-based index

//    - If sum < target:
//        left++   (need bigger sum)

//    - If sum > target:
//        right--  (need smaller sum)

// ⏱ Complexity:
// Time → O(n)
// Space → O(1)

// ⚠️ Mistakes:
// - Starting left from 1 ❌ (skip element)
// - Forgetting 1-based index ❌
// - Using == incorrectly (= mistake)
// - Applying on unsorted array ❌

// 🔁 When to Use:
// - Sorted array
// - Pair sum / target problems
// - Need optimized space (no HashMap)

// 🧠 Trick:
// Sorted array → think "can I use two pointers?"

// 🔄 Variations:
// - Two Sum (unsorted → HashMap)
// - 3Sum → sorting + two pointer

public class twoSumTwoPointer {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int i=0,j=numbers.length-1;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target) return new int[]{++i,++j};
            else if(sum<target) i++;
            else if(sum>target) j--;
        }
return new int[]{};
        }
       
    
} 