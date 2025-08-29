class File {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int lastPositive=0;
        int lastMinus=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr[lastPositive]=nums[i];
                lastPositive+=2;
            }else{
                arr[lastMinus]=nums[i];
                lastMinus+=2;
            }
        }
        return arr;
    }
}