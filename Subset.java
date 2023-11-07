import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        // set("", "ABC");
        System.out.println(setReturn("", "ABC"));
        // char a = 'a';
        System.out.println((int) ('p'));
    }

    static void set(String ans, String s) {
        if (s.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        set(ans + s.charAt(0), s.substring(1));
        set(ans, s.substring(1));
    }

    static ArrayList<String> setReturn(String ans, String s) {
        if (s.isEmpty()) {
            ArrayList<String> last = new ArrayList<>();
            if (ans.isEmpty()) {
                // last.add(ans);
                return last;
            } else {
                last.add(ans);
                return last;
            }
        }

        ArrayList<String> left = setReturn(ans + s.charAt(0), s.substring(1));
        ArrayList<String> right = setReturn(s.charAt(0) + ans, s.substring(1));
        left.addAll(right);
        return left;
    }
}
