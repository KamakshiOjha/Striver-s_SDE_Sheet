import java.util.*;
public class Factorial_number{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        int prod = 1;
        for(int i = 1;i<=n;i++){
            System.out.print(i + "! ");
        }
        System.out.println("\n");
        for(int i = 1;i<=n;i++){
            prod = prod*i;
        }
        return prod;
    }
}