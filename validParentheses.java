import java.util.Stack;

public class validParentheses {

    static boolean isValid(String s) {

        Stack<Character> pt = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pt.push(c);

            } else if (c == ')' || c == ']' || c == '}') {

                char top = pt.peek();

                if (pt.isEmpty())
                    return false;
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
                pt.pop();
            }
        }
        return pt.isEmpty();
    }

    public static void main(String[] agrs) {
        System.out.println(isValid("") ? true : false + "\n");
    }

}
