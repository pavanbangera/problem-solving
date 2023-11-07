import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "ABC");

    }

    static void permutation(String ans, String row) {
        if (row.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = row.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            permutation(f + ch + s, row.substring(1));

        }
    }
}
