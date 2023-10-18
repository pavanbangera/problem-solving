import java.util.Scanner;

public class CharactorCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the charactor");
        // here in the begin we take full string then using trim() remove the space
        // after this select the first char using charAt();
        char ch = in.next().trim().charAt(0);

        // java works on unicode so we directly check given char a-z or A-Z
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        }
    }
}
