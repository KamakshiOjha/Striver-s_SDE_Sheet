//better approach: o(n^2)
// Sorting the array takes O(n log n) time complexity
import java.util.*;

public class Sum_3 {
    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        sum(nums);
    }
    public static void sum(int[]nums){
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            HashSet<Integer> h = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int element = -(nums[i]+nums[j]);
            ArrayList<Integer> a = new ArrayList<>();
                if(h.contains(element)){
                    a.add(element);
                    a.add(nums[i]);
                    a.add(nums[j]);
                    Collections.sort(a);
                    if(!result.contains(a)){
                        result.add(a);
                    }
                    
                }else{
                    h.add(nums[j]);
                }
                
                
            }
        }
        for(List<Integer> i : result){
            System.out.println(i);
        }
    }
}
