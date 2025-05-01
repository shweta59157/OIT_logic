import java.util.Scanner;
public class celclus{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the faheraneit value:");
        Double faheraneit=sc.nextDouble();
        Double celclus=(faheraneit-32)*5/9;
        System.out.println("cleclus value:"+celclus);
    }
}