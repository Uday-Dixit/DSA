import java.util.*;
class File {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int y = target-x;

            if(ans.containsKey(y)){
                return new int[]{ans.get(y),i};
            }

            ans.put(x,i);
        }
        return new int[]{};
    }
}