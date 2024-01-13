// Union of Two Sorted Arrays
import java.util.*;
public class Union_Array {
    public static void main(String[] args) {
        int[]arr1= {1,2,3,4,5,7,8}; 
        int arr2[] = {2,3,4,4,5,8,9,0};
        int n = arr1.length;
        int m = arr2.length;
        union(arr1, arr2, n, m);

    }
    public static void union(int[]arr1,int arr2[],int n,int m){
        HashMap<Integer,Integer> mapp = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : arr1) {
            mapp.put(num, num);
        }
        for (int num : arr2) {
            mapp.put(num, num);
        }

        for (Map.Entry<Integer, Integer> entry : mapp.entrySet()) {
            arr.add(entry.getValue());
        }
        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i) +" " );
        }
    }
}
