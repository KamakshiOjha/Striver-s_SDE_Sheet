//Find the repeating and missing numbers
import java.util.*;
public class Find_repeat {
    public static void main(String[] args) {
        int []arr = {3,1,5,4,6,7,1};
        repeat_miss(arr);
    }
    public static void repeat_miss(int []arr){
        HashMap<Integer,Integer> count  = new HashMap<>();
        int n = arr.length;
        int y = 2;
        for(int i = 0;i<n;i++){
            count.put(arr[i],count.getOrDefault(arr[i], 0)+1);
        }
        int[] result = new int[2];
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue().equals(y)){
                result[0] = entry.getKey();
            }
        }
        int sum = 0;
        int actual = 0;
        for(int i = 1;i<=n;i++){
            sum = sum+i;
            actual = actual+arr[i-1];
            // System.out.println(result[i]);
        }
        result[1] = Math.abs(sum-actual+1);
        System.out.println(result[0] + " " + result[1]);
    }
}
