class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        int length = s.length();

        for(int i = 0 ; i < length; i ++){
            
            Character curr = s.charAt(i);
            if(stack.isEmpty()){
                if(curr == ']' || curr == '}' || curr == ')'){
                    return false;
                }
                else{
                    stack.push(curr);
                }
            }

            else if(curr == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if(curr == ')' && stack.peek() == '('){
                stack.pop();
            }
            else if(curr == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }
}
