package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class topKFrequency {
    public int[] topKFrequent(int[] nums, int k) {
        //if k is two return the 2 most freq integers in array
        //we can count and add is key value pairs 1
        Arrays.sort(nums);

        HashMap<Integer, Integer> map= new HashMap<>();

        //1,1,1,1,2,2,2,3,3,4
        for(int num: nums){
            //Returns current count or 0 if the int is new, then incr & puts the new value
            map.put(num, map.getOrDefault(num, 0) + 1);
        } //will only add not repeating ones

        //bucket sort algo
        List<Integer>[] buckets= new List[nums.length + 1];
        map.forEach((num,freq)->{
            if(buckets[freq]==null) buckets[freq]=new ArrayList<>();
            buckets[freq].add(num);
        });

        List<Integer> result= new ArrayList<>(); //length of list= size(), array= length
        for(int i= buckets.length-1;i>0&& result.size()<k;i--){
            if(buckets[i]!=null) result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
