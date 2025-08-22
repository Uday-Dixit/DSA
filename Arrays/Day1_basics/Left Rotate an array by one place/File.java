class File {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;// if k is greater than array length so 1 cycle is roated and array remain same so we only rotate remaining part.
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }
}