class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        return modifedBinarySearch( nums,  target,  start,  end);
    }
    public static int modifedBinarySearch(int nums[], int target, int start, int end) {
    // If start is greater than end, the target is not in the array
    if (start > end)
        return -1;

    // Calculate the mid index
    int mid = start + (end - start) / 2;

    // If the middle element is the target, return its index
    if (nums[mid] == target)
        return mid;

    // Check if the left side of the array is sorted
    if (nums[start] <= nums[mid]) {
        // If target is within the range of the sorted left side
        if (nums[start] <= target && target <= nums[mid])
            return modifedBinarySearch(nums, target, start, mid - 1); // Search in the left subarray
        else
            return modifedBinarySearch(nums, target, mid + 1, end); // Search in the right subarray
    } else {
        // If the right side must be sorted
        if (nums[mid] <= target && target <= nums[end])
            return modifedBinarySearch(nums, target, mid + 1, end); // Search in the right subarray
        else
            return modifedBinarySearch(nums, target, start, mid - 1); // Search in the left subarray
    }
}

}