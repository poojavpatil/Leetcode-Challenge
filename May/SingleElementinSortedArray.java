/* You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once. */

class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        if (nums == null || nums.length == 0) { return 0; }
        int ans = 0;
        for (int num: nums) {
            ans ^= num;
        }
        return ans;
    }
}
