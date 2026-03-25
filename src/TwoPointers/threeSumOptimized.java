package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSumOptimized {
    public List<List<Integer>> threeSum(int[] nums) {
        //HashMap<int, int> map= new HashMap<>();
        Arrays.sort(nums);

        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int x= nums[i];
            int l=i+1;
            int r= nums.length-1;

            while(l<r){
                if(x+nums[l]+nums[r]==0){
                    result.add(Arrays.asList(x, nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }else if(x+nums[l]+nums[r]<0){
                    l++;
                }else if(x+nums[l]+nums[r]>0){
                    r--;
                }
            }

        }
        return result;
    }
}
