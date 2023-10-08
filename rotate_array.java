public class RotateArray {
    public  void rotate(int[] nums, int k) {
        int n = nums.length;
        
        // Calculate the effective number of rotations (in case k is larger than n)
        k = k % n;
        
        reverse(nums, 0, n - 1);          // Reverse the entire array
        reverse(nums, 0, k - 1);          // Reverse the first k elements
        reverse(nums, k, n - 1);          // Reverse the remaining n-k elements
    }
    
    public  void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
