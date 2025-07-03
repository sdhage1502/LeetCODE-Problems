class Solution {
     public void moveZeroes(int[] nums) {
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
            else if (snowBallSize > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }
}// class Solution {

//     public void moveZeroes(int[] nums) {
//         int l = 0;
//         int r = 1;

//         while (l <= r && r <= nums.length - 1) {
//             if (nums[l] == 0) {
//                 if (nums[r] != 0) {
//                     int temp = nums[l];
//                     nums[l] = nums[r];
//                     nums[r] = temp;
//                 } else {
//                     r++;
//                 }

//             } else if (nums[l] != 0 || nums[r] != 0) {
//                 l++;
//                 r++;
//             }

//         }

//     }
// }