package ArraysAndHashing;

import java.util.HashSet;

public class longestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);//removes duplicates
        }
        // int[] setToArray= set.stream().mapToInt(Integer::intValue).toArray();
        //Arrays.sort(setToArray); cant sort as it will be O(nLogn)
        if (set.isEmpty()) return 0;
        int longest=0;
        for(Integer num: set){
            if(!set.contains(num-1)){
                int count=1;
                int currentNum=num;
                while(set.contains(currentNum+1)){
                    count++;
                    currentNum++;
                }
                longest= Math.max(longest,count);
            }
        }
        return longest;

    }
}
