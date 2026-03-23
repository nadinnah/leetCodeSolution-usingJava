import java.util.ArrayList;
import java.util.List;

public class insertInterval {
    //int[][] is a double array
    //int[][1] end last elements
    //int[][0] first elements
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //intervals[i][0]>=newInterval[0] = overlap
        List<int[]> result = new ArrayList<>();

        for(int i=0; i<intervals.length;i++){
            if(newInterval[0]>intervals[i][1] ){
                result.add(intervals[i]);
            }else if(newInterval[1]<intervals[i][0]){
                result.add(newInterval);
                newInterval= intervals[i];
            }else{ //(newInterval[0]<=intervals[i][1] && newInterval[1] >= intervals[i][0]) overlap
                newInterval[0]= Math.min(newInterval[0], intervals[i][0]);
                newInterval[1]= Math.max(newInterval[1], intervals[i][1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
