class Solution {
    public void sortColors(int[] nums) {
     for(int i =0;i<=nums.length-1;i++){
        for(int j=i;j<=nums.length-1;j++){
            if(nums[i]>nums[j]){
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]= temp;
        }
        }
     }

     for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
     }
    }
}