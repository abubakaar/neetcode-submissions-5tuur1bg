class Solution {
    public boolean hasDuplicate(int[] nums) {

        // Arrays.sort(nums);
        // for(int i = 0; i< nums.length-1;i++){
        //     if(nums[i+1] == nums[i])
        //         return true;
        // }
        // return false;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length;i++){
            if(map.containsKey(nums[i]))
               return true;
            else 
                map.put(nums[i], nums[i]);
        }
        return false;
    }
}