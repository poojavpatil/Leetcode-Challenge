/* An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image. */

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) 
    {
         int oColor = image[sr][sc];
        if (oColor == newColor) {
            return image;
        }
        int[][] dir = new int[][]{{0, 1},{0, -1},{1, 0},{-1, 0}};
        image[sr][sc] = newColor;
        for (int i = 0; i < dir.length; i ++) {
            int nextX = sr + dir[i][0];
            int nextY = sc + dir[i][1];
            if (nextX < 0 || nextX >= image.length || nextY < 0 || nextY >= image[0].length) {
                continue;
            }
            if (image[nextX][nextY] != oColor) {
                continue;
            }
            floodFill(image, nextX, nextY, newColor);
        }
        return image;    
    }
}
