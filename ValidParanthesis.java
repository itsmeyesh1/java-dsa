import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || 
                    (c == ')' && stack.peek() != '(') || 
                    (c == '}' && stack.peek() != '{') || 
                    (c == ']' && stack.peek() != '[')) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.size() % 2 != 0) {
            return false;
        }
        return stack.isEmpty();
    }
}
