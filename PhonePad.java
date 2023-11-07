import java.util.ArrayList;

public class PhonePad {

    public static void main(String[] args) {

        // phonePad("", "23");
        // System.out.println(ans);
        // ans.clear();
        System.out.println(phonePadReturn("", "23"));

    }

    static ArrayList<String> ans = new ArrayList<>();

    static void phonePad(String p, String digits) {
        if (digits.isEmpty()) {
            ans.add(p);
            return;
        }

        String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int digit = digits.charAt(0) - '0'; // Convert the first character to an integer
        String key = keyboard[digit];

        for (int i = 0; i < key.length(); i++) {
            phonePad(p + key.charAt(i), digits.substring(1));
        }

    }

    static ArrayList<String> phonePadReturn(String p, String digits) {
        if (digits.isEmpty()) {
            ArrayList<String> last = new ArrayList<>();
            last.add(p);
            return last;
        }

        String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        int digit = digits.charAt(0) - '0'; // Convert the first character to an integer
        String key = keyboard[digit];

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < key.length(); i++) {
            list.addAll(phonePadReturn(p + key.charAt(i), digits.substring(1)));
        }
        return list;
    }
}
