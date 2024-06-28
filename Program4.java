// Write a program to replace a character in a string at any specific index taken as input

import java.util.Scanner;
public class Program4{
    public static String Replace(String str, String character, int index,String replaced)
    {
        if(index!=0)
        {
            replaced=str.substring(0,index)+character+str.substring(index+1,str.length());
        }
        else
        {
            replaced= character+str.substring(1,str.length());
        }
        return replaced;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Enter a character:");
        String c=sc.next();
        System.out.println("Enter index:");
        int i=sc.nextInt();
        String r="";
        if(i>=s.length() || i<0)
        {
            System.out.println("Index not found");
        }
        else
        {
        System.out.println("The updated string is: "+Replace(s, c, i, r));
        }
        sc.close();
    }
}