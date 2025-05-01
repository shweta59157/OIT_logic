import java.util.Scanner;
public class doller{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of rupees:");
        Double doller=sc.nextDouble();
        Double rupees=doller*85.22;
        System.out.println("the doller "+doller+ "in rupees"+rupees);
    }
}