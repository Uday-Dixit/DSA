class NewFile {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
        }
        int ans = sum-temp;
        return  ans;
    }
}