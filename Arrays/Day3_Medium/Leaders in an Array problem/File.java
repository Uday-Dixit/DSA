import java.util.*;
class File {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n=nums.length;
        int maxRight=nums[n-1];
        arr.add(maxRight);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>maxRight){
                maxRight=nums[i];
                arr.add(maxRight);
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}