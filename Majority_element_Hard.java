//Majority Elements(>N/3 times) | Find the elements that appears more than N/3 times in the array
// Problem Statement: Given an array of N integers. Find the elements that appear more than N/3 times in the array. If no such element exists, return an empty vector.
import java.util.*;
public class Majority_element_Hard {
    public static void main(String[] args) {
        int []nums = {11,13,13,11,13,11};
        majority(nums);
    }
    public static void majority(int []nums){
        int n = nums.length;
        int s= n/3;
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i = 0;i<n;i++){
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue()>s){
                answer.add(entry.getKey());
                System.out.println(entry.getKey());
            }
        }
        for(Integer i : answer){
            System.out.println(i);
        }
        // return answer;
        
    }
}
