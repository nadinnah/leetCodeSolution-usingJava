package TwoPointers;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums== null) return 0;

        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return ++j;
        //or return j+1, but not j++ as increment will happen after return of j

        //wrong logic:
        //     HashSet<int> set= new HashSet<>();
        //     for(int num: nums){
        //        numsNoDupl.add(num);
        //     }

        //     int sizeOfSet= numsOfDupl.size();
        //     int[] arrNoDupl= new int(sizeOfSet);

        //     int i = 0;
        //     for (int numSet: set){
        //         arrNoDupl[i++]= numSet;
        //     }
        //     Arrays.sort(arrNoDupl);



    }
}
