import java.util.Scanner;
public class kilo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vlaues you convert:");
        Double kilometers=sc.nextDouble();
        Double convert=kilometers/1000;
        System.out.println("converts the values:" +convert);
    }
}