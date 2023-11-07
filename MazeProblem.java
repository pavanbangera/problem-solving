import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {

        // System.out.println(count(3, 3));
        // paths("", 3, 3);
        // System.out.println(pathsReturn("", 3, 3));
        // System.out.println(pathsReturnWithDiagonal("", 3, 3));

        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true } };
        // pathsWithObstical("", maze, 0, 0);
        System.out.println(pathsWithObsticalReturn("", maze, 0, 0));

    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int down = count(r - 1, c);
        int right = count(r, c - 1);
        return down + right;
    }

    static void paths(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (c > 1) {
            paths(p + "R", r, c - 1);
        }

        if (r > 1) {
            paths(p + "D", r - 1, c);
        }

    }

    static ArrayList<String> pathsReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> last = new ArrayList<>();
            last.add(p);
            return last;

        }
        ArrayList<String> list = new ArrayList<>();

        if (c > 1) {
            list.addAll(pathsReturn(p + "R", r, c - 1));
        }

        if (r > 1) {
            list.addAll(pathsReturn(p + "D", r - 1, c));
        }
        return list;
    }

    static ArrayList<String> pathsReturnWithDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> last = new ArrayList<>();
            last.add(p);
            return last;

        }
        ArrayList<String> list = new ArrayList<>();

        if (c > 1 && r > 1) {
            list.addAll(pathsReturnWithDiagonal(p + "D", r - 1, c - 1));
        }
        if (c > 1) {
            list.addAll(pathsReturnWithDiagonal(p + "H", r, c - 1));
        }

        if (r > 1) {
            list.addAll(pathsReturnWithDiagonal(p + "V", r - 1, c));
        }
        return list;
    }

    static void pathsWithObstical(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[row].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[row][col] == false) {
            return;
        }
        if (row < maze.length - 1) {
            pathsWithObstical(p + "D", maze, row + 1, col);
        }
        if (col < maze[row].length - 1) {
            pathsWithObstical(p + "R", maze, row, col + 1);
        }
    }

    static ArrayList<String> pathsWithObsticalReturn(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[row].length - 1) {
            ArrayList<String> last = new ArrayList<>();
            last.add(p);
            return last;
        }
        if (maze[row][col] == false) {
            return new ArrayList<>();
        }
        ArrayList<String> list = new ArrayList<>();
        if (row < maze.length - 1) {
            list.addAll(pathsWithObsticalReturn(p + "D", maze, row + 1, col));
        }
        if (col < maze[row].length - 1) {
            list.addAll(pathsWithObsticalReturn(p + "R", maze, row, col + 1));
        }
        return list;
    }
}
