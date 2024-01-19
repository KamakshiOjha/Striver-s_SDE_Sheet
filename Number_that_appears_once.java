// Find the number that appears once, and the other numbers twice
import java.util.*;
public class Number_that_appears_once {
    public static void main(String[] args) {
        int[]arr={1,2,6,7,8,8,6,5,3,2,4,0,88,77,34,5,63,77,34,5,63};
        Number_one(arr);
        
    }
    public static void Number_one(int[]arr){
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            count.put(arr[i],count.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
