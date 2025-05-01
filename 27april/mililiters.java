import java.util.Scanner;
public class mililiters{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vlaues you convert:");
        Double mililiters=sc.nextDouble();
        Double convert=mililiters/1000;
        System.out.println("converts the values:" +convert);
    }
}