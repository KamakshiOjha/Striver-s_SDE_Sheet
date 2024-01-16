// Find the missing number in an array
import java.util.*;
public class Find_missing {
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,8,9,10,11,12,13,14,15,16,18};
        int start = arr[0];
        int end = arr[arr.length-1];
        System.out.println(find(arr, start, end));
    }
    public static int find(int []arr,int start,int end){
        int i = 0;
        while(start<=end){
            if(arr[i]!=start){
                return start;
            }
            else{
                i++;
                start++;
            }
        }
        return -1;
    }
}
