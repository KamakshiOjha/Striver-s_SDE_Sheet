// Two Sum : Check if a pair with given sum exists in Array
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5,5};
        int target = 10;
        System.out.println(sum(nums, target));
    }
    public static boolean sum(int []nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            int need = target - nums[i];
            if(map.containsKey(need)){
                return true;
            }
            map.put(nums[i],need);
        }
        return false;
    }
}
