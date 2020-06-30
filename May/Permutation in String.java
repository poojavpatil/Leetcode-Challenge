/* Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string. */

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            s1 = sort(s1);
            if (s1.equals(sort(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }
    
    private String sort(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
