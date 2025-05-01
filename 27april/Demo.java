import java.util.Scanner;
public class Demo{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value you convert:");
        Double literes= sc.nextDouble();
        Double convert=literes*1000;
        System.out.println("converts the value:"+convert);


    }
}