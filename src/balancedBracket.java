import java.util.Stack;
public class balancedBracket {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // Push opening brackets
            }
            else {
                if(stack.isEmpty()){
                    return false;
                } else if ((c == ')' && stack.pop() != '(')) {
                    return false;
                } else if ((c == ']' && stack.pop() != '[')) {
                    return false;
                } else if ((c == '}' && stack.pop() != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
