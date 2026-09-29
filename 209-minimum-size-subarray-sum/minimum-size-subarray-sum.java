class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start =0;
        int sum = 0;
        int midlength = Integer.MAX_VALUE;

        for(int end = 0;end < nums.length;end++){
            sum += nums[end];

            while(sum >= target){
                midlength = Math.min(midlength, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        if(midlength == Integer.MAX_VALUE){
            return 0;
        }

        return midlength;
    }
}