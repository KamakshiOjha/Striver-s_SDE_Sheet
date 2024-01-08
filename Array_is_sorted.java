public class Array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6,7,8};
        System.out.println(IsSorted(arr));
    }
    public static boolean IsSorted(int []arr){
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
