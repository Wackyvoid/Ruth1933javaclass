import java.util.*;

public class ColorPath {

    public static int[][] colorPath(int[][] image, int sourceRow, int sourceCol, int newColor) {

        bfs(image, sourceRow, sourceCol, newColor);

        //int[] start = {sourceRow, sourceCol};
        //dfs(image, sourceRow, sourceCol, start, newColor, image[sourceRow][sourceCol]);

        return image;

    }

    public static void bfs(int[][] image, int row, int col, int newColor) {
        Queue<int[]> q = new LinkedList<int[]>();
        int[] start = {row, col};
        int original = image[start[0]][start[1]];
        q.offer(start);

        while (!q.isEmpty()) {
            int[] check = q.poll();

            //change color
            if (image[check[0]][check[1]] == original) {
                image[check[0]][check[1]] = newColor;
            }

            if ((check[0] - 1) >= 0 && image[check[0] - 1][check[1]] == original) {
                int[] leftIndices = {check[0] - 1, check[1]};
                q.offer(leftIndices);
            }
            if ((check[0] + 1) < image.length && image[check[0] + 1][check[1]] == original) {
                int[] rightIndices = {check[0] + 1, check[1]};
                q.offer(rightIndices);
            }
            if ((check[1] - 1) >= 0 && image[check[0]][check[1] - 1] == original) {
                int[] belowIndices = {check[0], check[1] - 1};
                q.offer(belowIndices);
            }
            if ((check[1] + 1) < image[0].length && image[check[0]][check[1] + 1] == original) {
                int[] aboveIndices = {check[0], check[1] + 1};
                q.offer(aboveIndices);
            }


        }

    }

    public static void dfs(int[][] image, int row, int col, int[] start, int newColor, int original) {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != original) {
            return;
        }

        if (image[row][col] == original) {
            image[row][col] = newColor;
        }

        //left
        dfs(image, row - 1, col, start, newColor, original);
        //right
        dfs(image, row + 1, col, start, newColor, original);
        //above
        dfs(image, row, col + 1, start, newColor, original);
        //below
        dfs(image, row, col - 1, start, newColor, original);


    }
}
