class File {
    public int secondLargestElement(int[] nums) {
        int max=-1;
        int max2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<max && nums[i]>max2){
                max2=nums[i];
            }
        }
        return max2;
    }
}