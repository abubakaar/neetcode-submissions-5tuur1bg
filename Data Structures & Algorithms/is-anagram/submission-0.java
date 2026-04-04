class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length())
            return false;

        char value1 , value2;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length() ; i++){
            
            value1 = s.charAt(i);
            value2 = t.charAt(i);

            map.put(value1, map.getOrDefault(value1,0) + 1);
            map.put(value2, map.getOrDefault(value2,0) - 1);

        }

        for(int value : map.values()){
            if(value != 0)
                return false;
        }
        return true;

    }
}
