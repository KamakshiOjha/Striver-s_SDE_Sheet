public class Reverse_array {
    public static void main(String[] args) {
        int[]arr = {5,7,8,93,4,0,1,3,5,6,3};
        reverse_arr(arr);
    }
    public static void reverse_arr(int[]arr){
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
