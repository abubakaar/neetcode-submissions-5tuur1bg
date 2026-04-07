class Solution {
    public int search(int[] nums, int target) {

        int mid = 0 , left = 0 ,  right = nums.length - 1;

        while(left <= right){

            mid = (left+right) / 2;
            System.out.println("mid ==> " + mid);
            System.out.println("value mid ==> " + nums[mid]);
            System.out.println("value left ==> " + left);
            System.out.println("value right ==> " + right);

            if(nums[mid] == target)
                return mid;
            
            else if(nums[mid] < target)
                left = mid + 1;

            else if(nums[mid] > target)
                right = mid - 1;

        }
        
        return -1;
    }
}
