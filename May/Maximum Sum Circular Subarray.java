/* Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.

Here, a circular array means the end of the array connects to the beginning of the array.  (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)

Also, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.) */

class Solution {
    public int maxSubarraySumCircular(int[] A) 
    {
        int total = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE,currMax = 0, currMin = 0;
        for(int a : A)
        {
            currMax = Math.max(currMax + a, a);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + a, a);
            minSum = Math.min(minSum, currMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
