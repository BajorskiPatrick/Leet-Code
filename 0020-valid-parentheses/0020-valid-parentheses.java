class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int i = 1;
        while (i < s.length()) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((curr == ')' && top != '(') || (curr == '}' && top != '{') || (curr == ']' && top != '[')) {
                    return false;
                }
                stack.pop();
            }
            i++;
        }
        return stack.isEmpty();
    }
}