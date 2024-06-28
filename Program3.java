// Write a program to check whether a input String is palindrome or not!
import java.util.Scanner;
public class Program3{
    public static String Reverse(String s,int l, String rev)
    {
        if(l==1)
        {
            return rev+s ;
        }
        else{
            return Reverse(s.substring(0,l-1),l-1,rev+s.substring(l-1,l));
        }
        
    }
    public static boolean Palindrome(String s)
    {
        String rev=""; 
        rev=Reverse(s, s.length(), rev );
        return(rev.equals(s));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Is "+s+" is a palindrome? "+Palindrome(s.toLowerCase()));
        sc.close();
    }
}
