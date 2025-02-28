//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String a = "([])";
        balancedBracket test = new balancedBracket();
        System.out.println(test.isBalanced(a));

        DecodeString decoder = new DecodeString();
        System.out.println(decoder.decodeString("3[a]2[bc]"));
        System.out.println(decoder.decodeString("2[abc]3[cd]ef"));
        System.out.println(decoder.decodeString("3[a2[c]]"));

        InfixtoPostfix I2P = new InfixtoPostfix();
        System.out.println(I2P.infix2Postfix("a+b*(c^d-e)^(f+g*h)-i"));
        System.out.println(I2P.infix2Postfix("2*3+4*5"));
    }
}