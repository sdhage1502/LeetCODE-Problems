import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length / 2;
        int result = 0;
        for (int i : nums) {
            int count=map.getOrDefault(i, 0) + 1;
            map.put(i,count );

            if (count > threshold) {

               return i;

            }
         
        }
        return -1;
    }
}
