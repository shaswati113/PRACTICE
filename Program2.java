// Write a program to input a Email from user and check whether that email is in correct format or not!
import java.util.Scanner;
public class Program2{
    public static boolean IsDigit(char c)
    {
        return c>='0' && c<='9';
    }
    public static boolean IsAlpha(char c)
    {
        return (c>='A' && c<='Z')||(c>='a' && c<='z');
    }
    public static boolean IsSym(char c)
    {
        return (c=='@')||(c=='.' || c=='-');
    }
    public static void Check_Email(String s)
    {
        if(s==null)
        {
            System.out.println("Email is not valid!");
        }
        else{
            int i=0; int flag=0;
            if(s.substring(s.length()-4).equals(".com"))
            {
                s=s.substring(0,s.length()-4);
                while(i<s.length())
                {
                    if(IsDigit(s.charAt(i)) || IsAlpha(s.charAt(i)) || IsSym(s.charAt(i)))
                    {
                        if(s.contains("@"))
                        {
                            if(s.endsWith("."))
                            {
                                flag=1;break;
                            }   
                        }
                        else
                        {
                            flag=1;break;
                        }  
                    }
                    else
                    {
                       flag=1;break;
                    }
                    i++;
                }
                if (flag==0) 
                {
                    System.out.println("Valid Email");
                }
                else if(flag==1)
                {
                    System.out.println("Invalid Email");
                }
            }
            else
            {
                System.out.println("Invalid Email");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        Check_Email(s);
        sc.close();
    }
}