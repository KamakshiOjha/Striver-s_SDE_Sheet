// Rotate Image by 90 degree
public class Rotate_matrix {
    public static void main(String[] args) {
        int [][]matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        Rotate_Matrix(matrix);
    }
    public static void Rotate_Matrix(int [][]matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int k = 0;
        int[][] answer = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = n-1;j>=0;j--){
                answer[i][j] = matrix[k][i];
                k++;
            }k=0;
        }

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(answer[i][j]);
                    }System.out.println("\n");
                }
    }
}
