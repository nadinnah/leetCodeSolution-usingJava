package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        List<int[]> result= new ArrayList<>();
        Arrays.sort(intervals, (a, b)->a[0]-b[0]);
        int[] currentInterval=intervals[0];
        for(int i=1; i<intervals.length;i++){
            if(intervals[i][0]<=currentInterval[1]){ //overlap
                currentInterval[1]= Math.max(intervals[i][1],currentInterval[1]);
            }else {
                result.add(currentInterval);
                currentInterval=intervals[i];
            }
        }
        result.add(currentInterval);

        return result.toArray(new int[result.size()][] );

    }
}
