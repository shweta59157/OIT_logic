import java.util.Scanner;
public class quotitent{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the divisior and divident:");
        Double divisior=sc.nextDouble();
        Double divident=sc.nextDouble();
        Double quotioent=divisior/divident;
        Double remainder=divisior%divident;
        System.out.println("the quotioent:"+quotioent);
        System.out.println("the remainder:"+remainder);

    }
}