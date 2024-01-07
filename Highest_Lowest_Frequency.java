import java.util.HashMap;
import java.util.Map;

public class Highest_Lowest_Frequency {
    public static void main(String[] args) {
        int []arr = {10,5,10,15,10,5};
        frequency(arr);
    }
    public static void frequency(int [] arr){
        HashMap<Integer, Integer> count = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i],count.get(arr[i])+1);
            }else{
                count.put(arr[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int currentCount = entry.getValue();
            if (currentCount > max) {
                max = currentCount;
            }
            if (currentCount < min) {
                min = currentCount;
            }
        }

        System.out.println(max);
        System.out.println(min);
        

    }
}
