// Find the Majority Element that occurs more than N/2 times
import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int []nums={4,4,2,4,3,4,4,3,2,4};
        System.out.println(majority(nums));
    }
    public static int majority(int []nums){
        int n = nums.length/2;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return -1;
    }
}
