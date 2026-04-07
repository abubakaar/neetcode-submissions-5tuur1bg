class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        if(s.length() == 1)
            return false;

        for(int i = 0; i< s.length(); i++){
            switch(s.charAt(i)){
                case '}':
                    if (stack.peek() != null && stack.peek() == '{')
                        stack.pop();
                    else return false;
                    break; 

                case ']':
                    if (stack.peek() != null &&'[' == stack.peek())
                        stack.pop();
                    else return false;
                    break; 

                case ')':
                    if (stack.peek() != null && stack.peek() == '(')
                        stack.pop();
                    else return false;
                    break;

                default: 
                    stack.push(s.charAt(i));
                    break;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
