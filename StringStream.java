public class StringStream {
    public static void main(String[] args) {
        skip("", "baacad");
        System.out.println(skip("baacatd"));
        System.out.println("helloapple".replaceAll("apple", "*"));

    }

    static void skip(String ans, String row) {
        if (row.isEmpty()) {
            System.out.println(ans);
            return;
        }
        if (row.charAt(0) == 'a') {
            skip(ans, row.substring(1));
        } else {
            skip(ans + row.charAt(0), row.substring(1));
        }
    }

    static String skip(String row) {
        if (row.isEmpty()) {
            return "";
        }
        if (row.charAt(0) == 'a') {
            return skip(row.substring(1));
        } else {
            return row.charAt(0) + skip(row.substring(1));
        }
    }
}
