public class Move_all_Zeros {
    public static void main(String[] args) {
        int []nums = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        move_zero(nums);
    }
    public static void move_zero(int []nums){
        for(int i = nums.length-1 ; i>=0 ; i--){
            if(nums[i]==0){
                for(int j = i+1; j<nums.length ;j++){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
