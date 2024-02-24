import java.util.Arrays;

public class Merge_Array_without_extraspace {
    public static void main(String[] args) {
        int n = 4; 
        int arr1[] = {1 ,4 ,8, 10}; 
        int m = 3; 
        int arr2[] = {2,3,9};
        merge(n,m,arr1, arr2);
    }
    public static void merge(int n,int m,int[]arr1 ,int[]arr2 ){
        int left = n-1;
        int right = 0;
        while(left>=0 && right<m){
            if(arr1[left] > arr2[right]){
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
            }else if(arr1[left] <= arr2[right]){
                left--;
                right++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<n;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");
        for(int i = 0;i<m;i++){
            System.out.print(arr2[i] + " ");
        }
        
    }
}
