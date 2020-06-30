//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

//Implemented using Kadane's algorithm

class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;
        for(int i = 0; i<nums.length;i++)
        {
            maxEndingHere = maxEndingHere + nums[i];
            if(maxSoFar < maxEndingHere)
            {
                maxSoFar = maxEndingHere;
            }
            if(maxEndingHere < 0)
            {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
