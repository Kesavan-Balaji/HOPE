import java.util.*;
public class NumberOfIslands {


    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    public static void dfs(int[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0; 

        
        dfs(grid, i + 1, j);     
        dfs(grid, i - 1, j);     
        dfs(grid, i, j + 1);     
        dfs(grid, i, j - 1);     
        dfs(grid, i + 1, j + 1); 
        dfs(grid, i + 1, j - 1);  
        dfs(grid, i - 1, j + 1); 
        dfs(grid, i - 1, j - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Number of islands: " + numIslands(grid));
    }
}
