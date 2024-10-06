class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean itemFound = false;
        int[] output = new int[2];
        int i = 0;
        int l = 1;
        while (!itemFound){
            if (nums[i] + nums[l] == target){
                output[0] = i;
                output[1] = l;
                itemFound = true;
                return output;
            } 
            else {
                if (l == nums.length - 1) {
                    i++;
                    l = i + 1;
            }
            else {
                l++;
            }
            }
        }
        return null;
    }
}
