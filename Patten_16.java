public class Patten_16 {
    public static void main(String[] args) {
        int i = 0;
        while(i<5){
            for(int k = 5-i-1;k>0;k--){
                System.out.print(" ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int m = 5-i-1;m>0;m--){
                System.out.print(" ");
            }
            System.out.print("\n");
            i++;
        }
    
    i = 0;
    while(i<5){
            for(int k = 0;k<i;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*5 - (2*i +1);j++){
                System.out.print("*");
            }
            for(int m = 0;m<i;m++){
                System.out.print(" ");
            }
            System.out.print("\n");
            i++;
        }
    } 
}
