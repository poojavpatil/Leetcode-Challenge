//Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

class Solution {
    public int findComplement(int num) 
    {
        char[] binary = Integer.toString(num, 2).toCharArray();
        complementBit(binary);
        return Integer.parseInt(String.valueOf(binary), 2);
    }
    private static void complementBit(char[] binary)
    {
        for(int i = 0; i< binary.length ; i++)
        {
            if(binary[i]=='0')
                binary[i]='1';
            else
                binary[i]='0';
        }
    }
}
