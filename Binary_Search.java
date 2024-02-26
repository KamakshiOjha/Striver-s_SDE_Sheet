public class Binary_Search {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,12,15,16,20};
        int target = 20;
        int n = arr.length;
        System.out.println(binarySearch(arr,n,target));
    }
    public static int binarySearch(int []arr,int n,int target){
        int left = 0,right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
