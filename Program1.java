// Write a Program to input String from user and output the reverse of the string 
import java.util.Scanner;
public class Program1{
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        int l=s.length();
        String r="";
        r=Reverse(s, l, r);
        System.out.println("The reverse of "+s+" is "+r);
        sc.close();
    }
}