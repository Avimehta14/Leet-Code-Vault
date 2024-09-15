// https://leetcode.com/problems/remove-element/

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

/*
Explanation:
- We need to remove all occurrences of a specific value (val) from the array and return the new length.
- We use an index pointer to overwrite the values in place.
- As we iterate through the array, if we find a value that doesn't match the given `val`, we move it to the front of the array, effectively "removing" the unwanted value.
- The final `index` gives us the new length of the array after removal.

Time Complexity: O(n)
Space Complexity: O(1)
*/