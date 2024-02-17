public class Spiral_Traversal {
    public static void main(String[] args) {
        int arr[][]= { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };

        Array_Spiral_Traversal(arr);
    }
    public static void Array_Spiral_Traversal(int arr[][]){
        int n = arr.length;
        int m = arr[0].length;
        int mid = n/2;
        // for(int i = 0;i<mid;i++){
        //     if(i%2 == 0){
        //         for(int j = 0;j<m;j++){
        //             System.out.println(arr[i][j]);
        //         }
        //     }else{
        //         for(int j = m-1;j<=0;j--){
        //             System.out.println(arr[i][j]);
        //         }
        //     }
        // }
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = m-1;
        while(top<mid){
            for(int i = 0;i<=right;i++){
                System.out.println(arr[top][i]);
            }
            top++;
            for(int i = top ;i<=bottom;i++){
                System.out.println(arr[i][right]);
            }right--;
            for(int i=right;i>=left;i--){
                System.out.println(arr[bottom][i]);
            }bottom--;
            for(int i = bottom;i>top;i--){
                System.out.println(arr[i][left]);
            }left++;
        }
       
    }
}
