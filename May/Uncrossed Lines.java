/* e write the integers of A and B (in the order they are given) on two separate horizontal lines.

Now, we may draw connecting lines: a straight line connecting two numbers A[i] and B[j] such that:

A[i] == B[j];
The line we draw does not intersect any other connecting (non-horizontal) line.
Note that a connecting lines cannot intersect even at the endpoints: each number can only belong to one connecting line.

Return the maximum number of connecting lines we can draw in this way. */

class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if (n==0 || m==0) return 0;
        
        int[][] dp = new int[n+1][m+1];
        for (int i = n-1; i >=0; i --)
        {
            for (int j = m-1; j >= 0; j--)
            {
                dp[i][j] = Math.max(dp[i+1][j],Math.max(dp[i][j+1],dp[i+1][j+1]+(A[i]==B[j]?1:0)));
            }
        }
        
        return dp[0][0];
    }
}
