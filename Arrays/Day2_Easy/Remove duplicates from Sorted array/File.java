class File {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int lastUnique=0;
        for(int j=1;j<nums.length;j++){
            if(nums[lastUnique]!=nums[j]){
                lastUnique++;
                nums[lastUnique]=nums[j];
            }
        }
        return lastUnique+1;
    }
}