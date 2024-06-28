// Take a String input and apply all the string methods you know! And show the output accordingly!
import java.util.Scanner;

public class Program5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println(s.contains(" "));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.substring(0, s.length()-2));
        System.out.println(s.compareTo("Java"));
        System.out.println(s.compareToIgnoreCase("Java"));

        sc.close();
    }
}