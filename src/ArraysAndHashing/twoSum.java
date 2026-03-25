package ArraysAndHashing;

import java.util.HashMap;

public class twoSum {
    public int[] twoSumSolution(int[] nums, int target) {
        //key will be value of nums, index of array will be the value
        //Integer instead of int in HashMap as Java collections cannot store primitive types.
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        //new is how we create an array object in Java
        return new int[]{};
    }
}
