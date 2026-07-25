class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int no =0;no < nums.length;no++){
            ans[no] = nums[no];
            ans[no + nums.length] = nums[no];
        }
        return ans;


    }
}