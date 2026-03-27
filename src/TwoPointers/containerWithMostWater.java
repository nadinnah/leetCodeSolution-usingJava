package TwoPointers;

public class containerWithMostWater {
    public int maxArea(int[] height) {
        int maxAmount=0;
        int currAmount=0;
        int leftPos= 0;
        int rightPos= height.length-1;

        while(leftPos<rightPos){
            int currWidth=rightPos-leftPos;
            currAmount= currWidth * Math.min(height[leftPos], height[rightPos]);
            if(currAmount>maxAmount){
                maxAmount=currAmount;
            }
            if(height[leftPos]<height[rightPos]){
                leftPos++;
            }else{
                rightPos--;
            }
        }
        return maxAmount;

    }
}
