import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, true, true },
                { true, true, true },
                { true, true, true } };

        // track("", maze, 0, 0);

        int[][] path = new int[maze.length][maze[0].length];
        trackWithPathMatrix("", maze, 0, 0, path, 1);

    }

    static void track(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[r].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        if (r < maze.length - 1) {
            track(p + "D", maze, r + 1, c);
        }
        if (c < maze[r].length - 1) {
            track(p + "R", maze, r, c + 1);
        }
        if (r > 0) {
            track(p + "R", maze, r - 1, c);
        }
        if (c > 0) {
            track(p + "R", maze, r, c - 1);
        }
        maze[r][c] = true;
    }

    static void trackWithPathMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[r].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[r][c] == false) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if (r < maze.length - 1) {
            trackWithPathMatrix(p + "D", maze, r + 1, c, path, step + 1);
        }
        if (c < maze[r].length - 1) {
            trackWithPathMatrix(p + "R", maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            trackWithPathMatrix(p + "R", maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            trackWithPathMatrix(p + "R", maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
