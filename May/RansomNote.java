//Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false. Each letter in the magazine string can only be used once in your ransom note.

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        Map<Character, Integer> times = new HashMap<>();
        for(char c: magazine.toCharArray())
        {
            if(times.containsKey(c))
            {
                times.put(c, times.get(c) + 1);
            }
            else
            {
                times.put(c, 1);
            }
        }
        for(char c: ransomNote.toCharArray())
        {
            if(times.containsKey(c))
            {
                if(times.get(c) > 1)
                {
                    times.put(c, times.get(c) - 1);
                }
                else
                {
                    times.remove(c);
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
