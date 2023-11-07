import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {

        // System.out.println(count(3, 3));
        // paths("", 3, 3);
        // System.out.println(pathsReturn("", 3, 3));
        System.out.println(pathsReturnWithDiagonal("", 3, 3));

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
}
