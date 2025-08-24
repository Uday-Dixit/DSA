
import java.util.ArrayList;

class File{
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i<n && j<m){
            if(i>0 && nums1[i-1]==nums1[i]){
                i++;
                continue;
            }
            if(j>0 && nums2[j-1]==nums2[j]){
                j++;
                continue;
            }

            if(nums1[i]>nums2[j]){
                arr.add(nums2[j]);
                j++;
            }else if(nums2[j]>nums1[i]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }

        while(i<n){
            if(i==0 || nums1[i]!=nums1[i-1]){
                arr.add(nums1[i]);
            }
            i++;
        }
        while(j<m){
            if(j==0 || nums2[j]!=nums2[j-1]){
                arr.add(nums2[j]);
            }
        j++;
        }
        int[] ans = new int[arr.size()];
        for(int k=0;k<ans.length;k++){
            ans[k]=arr.get(k);
        }
        return ans;
    }
}