import java.util.Scanner;

public class Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fib(n,a,b);
    }
    //without recursion:
    // public static void fib(int n) {
    //     int a = 0;
    //     int b = 1;
    //     int c = 0;
    //     int count = 2;
    //     System.out.println(a);
    //     System.out.println(b);
    //     while(count<=n){
    //         c = a+b;
    //         System.out.println(c);
    //         a = b;
    //         b = c;
    //         count++;
    //     }
    // }
    //with recursion:
    public static void fib(int n,int a,int b) {
        int c = a+b;
        System.out.println(c);
        a=b;
        b=c;
        n = n-1;
        if(n>0){
            fib(n, a, b);
        }
        
    }
}
