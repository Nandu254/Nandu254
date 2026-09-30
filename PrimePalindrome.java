import java.util.Scanner;
public class PrimePalindrome {
 static boolean isPrime(int n) {
 if(n < 2) return false;
 for(int i=2; i<=Math.sqrt(n); i++) if(n % i == 0) return false;
 return true;
 }
 static boolean isPalindrome(int n) {
 int rev=0, temp=n;
 while(temp > 0) { rev = rev*10 + temp%10; temp /= 10; }
 return rev == n;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int n = sc.nextInt();
 if(isPrime(n) && isPalindrome(n))
 System.out.println(n + " is a Prime Palindrome.");
 else
 System.out.println(n + " is NOT a Prime Palindrome.");
 }
}