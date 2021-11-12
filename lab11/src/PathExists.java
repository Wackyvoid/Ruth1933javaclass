import java.util.LinkedList;
import java.util.Queue;

public class PathExists {
    private static boolean exists;

    public static boolean doesPathExist(char[][] grid, int sourceRow, int sourceCol) {
        char[][] gridVisited = new char[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            System.arraycopy(grid[i], 0, gridVisited[i], 0, grid[0].length);
        }

        bfs(grid, gridVisited, sourceRow, sourceCol);

        for (char[] row : gridVisited) {
            for (char c : row) System.out.print(c + " ");
            System.out.println();
        }

        //dfs(grid, sourceRow, sourceCol);

        return exists;
    }

    public static void bfs(char[][] grid, char[][] gridVisited, int sourceRow, int sourceCol) {
        Queue<int[]> q = new LinkedList<int[]>();
        int[] start = {0, 0};
        q.offer(start);
        gridVisited[0][0] = '0';

        while (!q.isEmpty()) {
            int[] check = q.poll();

            if (gridVisited[check[0]][check[1]] != 0 && check[0] != 0 && check[1] != 0) {
                if (grid[check[0]][check[1]] == 'v') {
                    System.out.println("x" + check[0]);
                    System.out.println("y" + check[1]);

                    exists = true;
                }
            }

            if ((check[0] - 1) >= 0 && grid[check[0] - 1][check[1]] != 'x') {
                int[] leftIndices = {check[0] - 1, check[1]};
                if (gridVisited[check[0] - 1][check[1]] != '0') {
                    q.offer(leftIndices);
                    gridVisited[check[0] - 1][check[1]] = '0';
                }
            }
            if ((check[0] + 1) < grid.length && grid[check[0] + 1][check[1]] != 'x') {
                gridVisited[check[0] + 1][check[1]] = '0';
                int[] rightIndices = {check[0] + 1, check[1]};
                if (gridVisited[check[0] + 1][check[1]] != '0') {
                    q.offer(rightIndices);
                    gridVisited[check[0] + 1][check[1]] = '0';
                }
            }
            if ((check[1] - 1) >= 0 && grid[check[0]][check[1] - 1] != 'x') {

                int[] belowIndices = {check[0], check[1] - 1};
                if (gridVisited[check[0]][check[1] - 1] != '0') {
                    q.offer(belowIndices);
                    gridVisited[check[0]][check[1] - 1] = '0';
                }
            }
            if ((check[1] + 1) < grid[0].length && grid[check[0]][check[1] + 1] != 'x') {

                int[] aboveIndices = {check[0], check[1] + 1};
                if (gridVisited[check[0]][check[1] + 1] != '0') {
                    q.offer(aboveIndices);
                    gridVisited[check[0]][check[1] + 1] = '0';
                }
            }

        }

    }

    public static void dfs(char[][] grid, int sourceRow, int sourceCol) {

    }

}
