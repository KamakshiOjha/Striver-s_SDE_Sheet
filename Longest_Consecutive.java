import java.util.Arrays;

public class Longest_Consecutive {
    public static void main(String[] args) {
        int []nums = {3, 8, 5, 7, 6,9,10};
        System.out.println(Sequence_Array(nums));
    }
    public static int Sequence_Array(int []nums){
        int count = 1;
        Arrays.sort(nums);
        int var = nums[0];
        int n = nums.length;
        for(int i =1;i<n;i++){
            if(Math.abs(var-nums[i])==1){
                count++;
            }
            var = nums[i];

        }
        return count;
    }
}
