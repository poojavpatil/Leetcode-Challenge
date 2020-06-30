/* There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.*/

//See how much more we can benefit if we chose to go to city A than B (subtract A from B)

class Solution {
    public int twoCitySchedCost(int[][] costs) {
     int totalcost = 0;
        for(int[] cost:costs)
        {
            totalcost += cost[0];
        }
    int[] refund = new int[costs.length];
        for(int i =0; i<costs.length;i++)
        {
            refund[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(refund);
        for(int i =0;i<refund.length/2;i++)
        {
            totalcost += refund[i];
        }
        return totalcost;
    }
}
