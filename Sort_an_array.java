// Sort an array of 0s, 1s and 2s
public class Sort_an_array {
    public static void main(String[] args) {
        int []nums = {0,1,2,2,0,0,2,1,1,0};
        sort(nums);
    }
    public static void sort(int []nums){
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
