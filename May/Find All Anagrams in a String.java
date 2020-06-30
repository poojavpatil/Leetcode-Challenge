/* Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter. */

//Implementing sliding window approach

class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> output = new ArrayList();
        if(s.length() == 0 || s == null)
            return output;
        
        //this will store frequency of each character
        int[] char_count = new int[26];
        for(char c: p.toCharArray())
        {
            char_count[c-'a']++;
        }
        //right will be the ending boundary
        int left = 0, right = 0;
        int count = p.length();
        
        while(right < s.length())
        {
            if(char_count[s.charAt(right++)-'a']-- >= 1) count--;
            
            if(count == 0) output.add(left);
            
            if(right - left == p.length() && char_count[s.charAt(left++)-'a']++ >= 0) count++;
        }
        
        
        return output;
    }
}
