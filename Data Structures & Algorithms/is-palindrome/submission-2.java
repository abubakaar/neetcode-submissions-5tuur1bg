class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int frontPointer = 0;
        int backPointer = s.length() - 1;

        while( frontPointer != backPointer){
            
            if(frontPointer > backPointer)
                break;

            if(!Character.isLetterOrDigit(s.charAt(frontPointer))){
                System.out.println("f++");
                frontPointer ++;
            }

            else if(!Character.isLetterOrDigit(s.charAt(backPointer))){
                System.out.println("b--");
                backPointer --;
            }

            else if(s.charAt(frontPointer) == s.charAt(backPointer)){
               System.out.println("equal");
                frontPointer ++;
                backPointer --;
            }
            
            else{
                System.out.println("false");
                return false;
            }
        }
        return true;
    }
}
