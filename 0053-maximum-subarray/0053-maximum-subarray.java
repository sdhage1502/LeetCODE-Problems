class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum=Integer.MIN_VALUE;
        int n = nums.length-1;
        for(int i =0;i<=n;i++){
            sum = sum + nums[i];
           maxSum=Math.max(sum,maxSum); 
            if(sum<0){
                sum=0;
            }
                              
        }

      return maxSum;

    }
}