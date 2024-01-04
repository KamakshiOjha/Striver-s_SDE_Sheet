import java.util.*;
public class Palindrome_String {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : " );
        String s = sc.next();
        System.out.println(ispalindrome(s));
   } 
   public  static boolean ispalindrome(String s){
    int n = s.length();
    int i = 0;
    int j = s.length()-1;
    while(i<(n/2-1) && j>n/2){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
   }
}
