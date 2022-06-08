class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0,j=0;
        while(n<nums.length)
        {
            arr[j++] = nums[i++];
            arr[j++] = nums[n++];
        }
        return arr;
    }
}