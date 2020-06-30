/* You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane. */

class Solution {
    public boolean checkStraightLine(int[][] coordinates) 
    {
        return IntStream.range(0, coordinates.length - 2)
				.allMatch(i -> isLine(coordinates[i], coordinates[i + 1], coordinates[i + 2]));
	}

	boolean isLine(int[] p1, int[] p2, int[] p3) {
		return (p2[1] - p1[1]) * (p3[0] - p1[0]) == (p3[1] - p1[1]) * (p2[0] - p1[0]);
	}
}
