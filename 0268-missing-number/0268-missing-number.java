class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
    int currentSum = 0;
    int maxsum = (n*(n+1))/2 ;
        for(int i=0;i<n;i++){
         currentSum += nums[i];
        }
        return maxsum-currentSum;
    }
}