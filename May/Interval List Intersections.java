/* Given two lists of closed intervals, each list of intervals is pairwise disjoint and in sorted order.

Return the intersection of these two interval lists.

(Formally, a closed interval [a, b] (with a <= b) denotes the set of real numbers x with a <= x <= b.  
The intersection of two closed intervals is a set of real numbers that is either empty, or can be represented as a closed interval.  
For example, the intersection of [1, 3] and [2, 4] is [2, 3].) */


class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) 
    {
        List<int[]> list = new ArrayList<>();
        int i = 0, j = 0;
        while(i < A.length && j < B.length){
            int maxStart = Math.max(A[i][0], B[j][0]);
            int minEnd = Math.min(A[i][1], B[j][1]);
            if(maxStart <= minEnd){
                list.add(new int[]{maxStart, minEnd});
            }
            if(A[i][1] < B[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int[][] res = new int[list.size()][2];
        i = 0;
        for(int[] arr : list){
            res[i++] = arr;
        }
        
        return res;
    }
}
