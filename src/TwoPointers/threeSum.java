package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //HashMap<int, int> map= new HashMap<>();
        Arrays.sort(nums);

        HashSet<List<Integer>> result=new HashSet<>();//takes a longerTime
        for (int i = 0; i < nums.length - 2; i++){
            int x= nums[i];
            int l=i+1;
            int r= nums.length-1;

            while(l<r){
                if(x+nums[l]+nums[r]==0){
                    result.add(Arrays.asList(x, nums[l], nums[r]));
                    l++;
                    r--;
                }else if(x+nums[l]+nums[r]<0){
                    l++;
                }else if(x+nums[l]+nums[r]>0){
                    r--;
                }
            }

        }
        return new ArrayList<>(result);
    }
}
