// 2 sum (indices)
public class Sum_problem {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        Two_sum(arr, target);
    }

    public static void Two_sum(int []arr, int element){

        for(int i = 0; i<arr.length;i++){
            for(int j = i; j<arr.length ; j++){
                int sum = arr[i]+arr[j];
                if(sum == element && arr[i]!=arr[j]){
                    System.out.println("true");
                    System.out.println(arr[i] + " " +arr[j]);
                }
                else{
                    System.out.println("false");

                }
                
            }

        }

    }
}
