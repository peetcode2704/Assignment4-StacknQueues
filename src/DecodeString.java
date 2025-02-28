import java.util.Stack;

public class DecodeString {
    public String decodeString(String s){
        Stack<Integer> stackNum = new Stack<>();
        Stack<String> stackString = new Stack<>();
        int Num = 0;
        String tempString = "";

        for (char c : s.toCharArray()){
            if(Character.isDigit(c)){
                Num = Num * 10 + (c - '0');
            } else if (c == '['){
                stackString.push(tempString);
                stackNum.push(Num);
                tempString = "";
                Num = 0;
            } else if (c == ']') {
                int mulCount = stackNum.pop();
                String prevString = stackString.pop();
                String result = "";
                for (int i = 0; i < mulCount; i++) {
                    result += tempString;
                }
                tempString = prevString + result;
            }else {
                tempString += c;
            }
        }
        return tempString;
    }
}

