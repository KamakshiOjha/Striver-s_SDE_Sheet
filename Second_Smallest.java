import java.util.*;
public class Second_Smallest {
    public static void main(String[] args) {
        int[] arr = {9,3,7,4,8,2,0,10,3,5,7,1};
        Second_smallest_largest(arr);
    }
    public static void Second_smallest_largest(int[]arr){
        Arrays.sort(arr);
        System.out.println("Second smallest : " + arr[1]);
        System.out.println("Second largest : " + arr[arr.length-2]);
    }
}
