// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null){
            return 0;
        }
        for (int i =0; i<= haystack.length() - needle.length(); i++)
        {
            int j =0 ;
            while(j<needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}

/*
Explanation:
- The function searches for the first occurrence of the string `needle` in the string `haystack`.
- It iterates through the `haystack`, and for each position, it checks if the substring starting at that position matches the `needle`.
- If a match is found, it returns the index of the first occurrence.
- If no match is found by the end of the loop, it returns -1.
- The loop stops checking early if the remaining portion of `haystack` is shorter than `needle`.

Time Complexity: O(n * m)
Space Complexity: O(1)
*/