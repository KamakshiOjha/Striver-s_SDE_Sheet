public class Search {
    public static void main(String[] args) {
        int[] arr = {1,5,9,3,8,2,4,7};
        int k = 9;
        System.out.println(Linear_Search(arr,k));
    }
    public static int Linear_Search(int []arr,int k){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
