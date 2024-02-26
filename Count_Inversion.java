public class Count_Inversion {
    public static void main(String[] args) {
        int []arr = {5,4,3,2,1};
        Inversion(arr);
    }
    public static void Inversion(int []arr){
        // int n = arr.length;
        // int count= 0;
        // for(int i = 0;i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(i<j && arr[j]<arr[i]){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);
        int [] arr2 = arr;
        boolean op = false;
        int n = arr.length;
        int i = 0;
        int net = 0;
        while(i<n){
            net += count(i, i+1, arr, arr2);
            i++;
        }
             
        System.out.println(net);
    }
    public static int count(int i,int start,int []arr,int[]arr2){
        int total = 0;
        int m = arr2.length;
        for(int j = start;j<m;j++){
            if(arr[i]>arr2[j] && i<j){
                total++;
            }
        }
        return total;
    }
}
