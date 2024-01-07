import java.util.HashMap;
import java.util.Map;

public class Count_frequency {
    public static void main(String[] args) {
        int []arr = {10,5,10,15,10,5};
        frequency(arr);

    }
    public static void frequency(int[]arr){
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i],count.get(arr[i])+1);
            }
            else{
                count.put(arr[i],1);
            }
        }
        for(Map.Entry entry : count.entrySet() ){
            System.out.println("Key is : " + entry.getKey()+", Value is : "+ entry.getValue());
        }
    }
}
