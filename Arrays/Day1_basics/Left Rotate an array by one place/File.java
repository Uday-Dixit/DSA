class File {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            int temp=nums[nums.length-1];
            for(int j=0;j<nums.length-1;j++){
                nums[nums.length-1-j]=nums[nums.length-2-j];
            }
            nums[0]=temp;
        }
    }
}