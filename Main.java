import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str = sc.nextLine();
        boolean chk = parenthesisChk(str);

        System.out.println("output: " + chk);

    }

    public static boolean parenthesisChk(String str) {
        Stack<String> strStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            String subStr = str.substring(i, i + 1);
            if (subStr.equals("("))
                strStack.push(subStr);
            else if (subStr.equals(")")) {
                if (strStack.isEmpty())
                    return false;
                else
                    strStack.pop();
            }
        }

        if (strStack.isEmpty())
            return true;
        else
            return false;
    }
}