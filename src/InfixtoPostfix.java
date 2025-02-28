import java.util.Stack;

public class InfixtoPostfix {
    public static int getPrecedence(char op){
        if(op == '+' || op == '-'){
            return 1;
        }else if(op == '*' || op == '/'){
            return 2;
        }else if(op == '^'){
            return 3;
        }
        return 0;
    }

    public String infix2Postfix(String infix){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}
