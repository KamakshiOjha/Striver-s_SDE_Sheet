
public class Buy_and_sell {
    public static void main(String[] args) {
        int []nums = {7,1,5,3,6,4};
        BuySell_Stock(nums);
    }
    public static void BuySell_Stock(int []nums){
        // int profit = 0;
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i]<nums[j]){
        //             profit = Math.max(Math.abs(nums[i]-nums[j]),profit);
        //         }
        //     }
        // }
        // System.out.println(profit);

        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
                min = Math.min(nums[i],min);
                max = Math.max(nums[i] - min,max);
        }
        System.out.println(max);
    }
}
