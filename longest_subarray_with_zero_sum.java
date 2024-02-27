//Length of the longest subarray with zero Sum
import java.util.*;
public class longest_subarray_with_zero_sum {
    public static void main(String[] args) {
        int n = 8;
        int nums[] = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(max_length_subarray(nums,n));
    }
    public static int max_length_subarray(int[]nums,int n){
        int Max= Integer.MIN_VALUE;
        int sum = 0;
        HashMap<Integer,Integer> record = new HashMap<>();
        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(sum == 0){
                Max = i+1;
            }else{
                if(record.get(sum) != null){
                    Max = Math.max(Max,i-record.get(sum));
                }else{
                    record.put(sum,i);
                }
            }
        }
        return Max;
    }
}
