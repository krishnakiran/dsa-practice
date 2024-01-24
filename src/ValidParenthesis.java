import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        boolean output = isValid("(]");
        System.out.println(output);
    }

    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                characterStack.push(c);
            }
            else if(c == ')' && !characterStack.isEmpty() && characterStack.peek() == '('){
                characterStack.pop();
            }
            else if(c == ']' && !characterStack.isEmpty() && characterStack.peek() == '['){
                characterStack.pop();
            }
            else if(c == '}' && !characterStack.isEmpty() && characterStack.peek() == '{'){
                characterStack.pop();
            }
            else {
                characterStack.push(c);
            }
        }
        if (characterStack.size() == 0)
            return true;
        return false;
    }
}
