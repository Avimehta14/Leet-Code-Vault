// https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> nmap = new HashMap<>();
        int n = nums.length;

        for (int i =0 ; i< n; i++)
        {
            int val = target - nums[i];
            if (nmap.containsKey(val)) {
                return new int[] {nmap.get(val),i};
            }
            else{
                nmap.put(nums[i],i);
            }
        }
        return null;
    }
}

/*
Explanation:
- The goal is to find two numbers in the array that sum up to the given target.
- We create a hashmap to store each number we encounter along with its index. ( Key = num , Val = indice )
- For each number in the array, we calculate the value needed to reach the target (i.e., target - current number).
- If this value is already in the hashmap, it means we have found the two numbers that add up to the target, and we return their indices.
- If not, we add the current number to the hashmap and continue to the next one.

Time Complexity: O(n)
Space Complexity: O(n)
*/