//Leaders in an Array
import java.util.ArrayList;

public class Leaders_array {
   public static void main(String[] args) {
    int[]nums = {10, 22, 12, 3, 0, 6};
    Leader(nums);
   }
   public static void Leader(int[]nums){
        ArrayList<Integer> lead = new ArrayList<>();
        int max = 0;
        for(int i = nums.length-1;i>=0;i--){
            if(max<nums[i]){
               max = nums[i];
               lead.add(max);
            }
        }
        for(int i:lead){
         System.out.println(i);
        }
   } 
}
