package ArraysAndHashing;

public class productOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int leftProd=1;
        int rightProd=1;

        for(int i=nums.length-1;i>=0;i--){
            answer[i]=rightProd;
            rightProd*=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            answer[i]*=leftProd;
            leftProd*=nums[i];
        }
        return answer;
    }
}
