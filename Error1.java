import java.io.*;
import java.util.*;
public class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer to check it is palindrome or not");
        int n = sc.nextInt();
        int temp=n,rev=0;
        while(n>0) {
            int rem = n%10;
            rev = (rev*10)+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println(temp+"is a Palindrome");
        }
        else {
            System.out.println(temp+"is not a Palindrome");
        }
    }
}
