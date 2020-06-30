// Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {
    public void moveZeroes(int[] nums) 
    {
        int i = 0, j = 0;
        while(j < nums.length)
        {
            if(nums[j]!=0)
                nums[i++] = nums[j];
            j++;
        }
        while(i < nums.length)
        {
            nums[i++] = 0;   
        }
    }
}
