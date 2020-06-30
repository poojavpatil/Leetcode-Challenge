/* Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"] */

//Reverse string by making it half

class Solution {
    public void reverseString(char[] s) 
    {
        for(int i = 0; i<s.length/2;i++)    
        {
            char t = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = t;
         }
    }
}


//It is so much easier in python

class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        s.reverse()
        
